// 리스트 9.5  이름에 의한 호출 사용

def byNameAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError
