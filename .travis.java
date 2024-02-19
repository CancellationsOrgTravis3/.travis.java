os: linux
vm:
  size: [large]
language: java
services:
  - docker
cache: bundler
dist: bionic


install: skip

jobs:
  include:
    - name: failing
      script: true

after_success:
  - echo done
  - echo $TRAVIS_TEST_RESULT
