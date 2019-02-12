class Solutionofatio {
	public int myAtoi(String str) {
		long L = str.length();
		if (str.length() == 0) {// 输入的str为空
			System.out.println("return 0");
			return 0;
		} else {// 输入的str不是空的. str.length()>=1
			if ((str.charAt(0) < 48 || str.charAt(0) > 57) && str.charAt(0) != 45 && str.charAt(0) != 32
					&& str.charAt(0) != 43) {// str开头如果不是数字、空格、负号，那么直接放弃
				System.out.println("return 0");
				return 0;
			} else {// str开头为数字or空格or负号or正号
				if (str.charAt(0) == 45) {// str开头是负号
					if (str.length() == 1) {// str是一个元素，直接放弃
						return 0;
					} else {// str.length>1
						if (str.charAt(1) < 48 || str.charAt(1) > 57) {// str开头为-，后面紧跟着的不是数字，放弃
							return 0;
						} else {// str开头为-，后面紧跟数字
							int fuck = 0;
							for (int i = 1; i < str.length(); i++) {
								if (str.charAt(i) < 48 || str.charAt(i) > 57) {// fuck记录最后一个数字
									fuck = i - 1;
									break;
								}
								if (i == str.length() - 1) {
									fuck = str.length() - 1;
								}
							}
							String S = "0";
							for (int i = 1; i <= fuck; i++) {// i=1；把负号剃掉了，fuck的作用是保证后面的非数字给剃掉
								S = S + str.charAt(i);
							}
							System.out.println("line32:" + S);
							if (S.length() >= 2) {
								S = S.substring(1);
							}
							System.out.println("line36:" + S);
							int count0 = 0;// count0记录第一个不是0的位置
							if (S.charAt(0) == 50 - 2) {
								for (int i = 0; i < S.length(); i++) {
									if (S.charAt(i) != 50 - 2) {
										count0 = i;
										break;
									}
									if (i == S.length() - 1) {
										System.out.println("system return 0");
										return 0;
									}
								}
							}
							System.out.println("count0=" + count0);
							S = S.substring(count0);// 把str开头的0全部去掉，要是没有就不用管

							System.out.println("no 0: " + S);

							if (S.length() > 10) {
								System.out.println("-2^31");
								long ans = -1 * (long) Math.pow(2, 31);
								int b = (int) ans;
								int ans2 = b;

								System.out.println("flow " + ans2);
								return ans2;

							}
							long answer = Long.parseLong(S.trim());
							if (answer > ((long) Math.pow(2, 31))) {
								System.out.println("flow  -2^31");
								return -2147483648;
							} else {
								int b = (int) answer;
								int answer2 = b;
								answer2 = answer2 * (-1);
								System.out.println("answer=" + answer2);
								return answer2;
							}

						}

					}

				}

				else if (str.charAt(0) == 32) {// str第一个元素是空格
					if (str.length() == 1) {// str是一个元素，直接放弃
						return 0;
					} else {// str.length()>1
						int mark = 0;
						for (int i = 0; i < str.length(); i++) {// 用mark记录str第一个不是空格的元素的位置
							if (str.charAt(i) != 32) {
								mark = i;
								break;
							}
							if (i == str.length()) {
								return 0;
							}
						}
						System.out.println("98mark=" + mark);
						if (str.charAt(mark) == 45) {// 空格过后第一个是-，按照上面的处理
							if ((mark + 1) == str.length()) {// 空格过后只有一个元素，空格过后只是负号，直接放弃
								return 0;
							} else {// 空格过后起码还有2个元素，第一个是-
								if (str.charAt(mark + 1) < 48 || str.charAt(mark + 1) > 57) {// 空格过后开头为-，后面紧跟着的不是数字，放弃
									return 0;
								} else {// 空格过后开头为-，后面紧跟数字
									int fuck = 0;
									for (int i = mark; i < str.length(); i++) {
										if (i < str.length() - 1) {
											if (str.charAt(i + 1) < 48 || str.charAt(i + 1) > 57) {
												fuck = i;
												break;
											}
										}
										if (i == str.length() - 1) {
											fuck = str.length() - 1;
										}
									}
									System.out.println("最后一个数字的位置fuck=" + fuck);
									String S = "0";
									for (int i = mark; i <= fuck; i++) {
										S = S + str.charAt(i);
									}
									System.out.println(S);
									if (S.length() >= 2) {
										S = S.substring(2);
									}

									System.out.println(S);

									if (S.length() > 10) {
										long ans = -1 * (long) Math.pow(2, 31);
										int b = (int) ans;
										int ans2 = b;
										System.out.println("flow " + ans2);
										return ans2;
									}

									long answer = Long.parseLong(S.trim());
									if (answer > ((long) Math.pow(2, 31))) {
										System.out.println("-2^31");

										long ans = -1 * (long) Math.pow(2, 31);
										int b = (int) ans;
										int ans2 = b;
										ans2 = ans2 * (-1);
										System.out.println("flow " + ans);
										return ans2;
									} else {
										int b = (int) answer;
										int answer2 = b;
										answer2 = answer2 * (-1);
										System.out.println("answer=" + answer2);
										return answer2;
									}

								}

							}

						} else if ((str.charAt(mark) >= 48 && str.charAt(mark) <= 57) || str.charAt(mark) == 43) {// 空格过后，第一个是数字，按照下面的处理
							// if (str.charAt(mark) == 48) {
							// System.out.println("空格过后第一个是0，return 0");
							// return 0;
							// }
							if (str.length() == (mark + 1)) {// 空格过后就一个数字or+
								if (str.charAt(0) == 43) {
									System.out.println("just one single + after space, system return 0");
									return 0;
								}
								String S = "0";
								S = S + str.charAt(mark);
								S = S.substring(1);
								System.out.println(S);
								long answer = Long.parseLong(S.trim());
								int b = (int) answer;
								int answer2 = b;
								System.out.println("answer=" + answer2);
								return answer2;

							} else {// 空格后面起码2个元素，第一个要么是+，要么是数字

								if (str.charAt(mark) == 43) {// space后面是+
									if (str.length() == mark + 1) {// 开头是+，长度为1
										return 0;
									} else {// space后是+，长度大于1
										if (str.charAt(1 + mark) < 48 || str.charAt(1 + mark) > 57) {// space后是+，后面紧跟的不是数字
											System.out.println("system return 0");
											return 0;
										} else {// 开头是+，后面紧跟数字

											str = str.substring(mark + 1);// 去掉+和前面的空格
											System.out.println("192reduce + :" + str);
											long fuck = 0;// fuck记录最后一个数字的位置
											for (int i = 1; i < str.length(); i++) {
												if (i < str.length() - 1) {
													if (str.charAt(i) < 48 || str.charAt(i) > 57) {
														fuck = i - 1;
														break;
													}
												}

												if (i == str.length() - 1) {
													fuck = str.length() - 1;
												}
											}
											System.out.println("207linefuck=" + fuck);
											String S = "0";

											for (int i = 0; i <= fuck; i++) {
												S = S + str.charAt(i);
											}
											System.out.println("213line S=" + S);
											S = S.substring(1);
											System.out.println(S + "www");
											int count0 = 0;
											if (S.charAt(0) == 50 - 2) {
												for (int i = 0; i < S.length(); i++) {
													if (S.charAt(i) != 50 - 2) {
														count0 = i;
														break;
													}
													if (i == S.length() - 1) {
														System.out.println("system return 0");
														return 0;
													}
												}
											}
											System.out.println("count0=" + count0);
											S = S.substring(count0);
											System.out.println("no 0: " + S);
											if (S.length() > 10) {
												System.out.println("2^31-1");
												return (int) (Math.pow(2, 31) - 1);
											}
											long answer = Long.parseLong(S.trim());
											if (answer > ((long) Math.pow(2, 31) - 1)) {
												System.out.println("2^31-1");
												return (int) (Math.pow(2, 31) - 1);
											} else {
												int b = (int) answer;
												int answer2 = b;
												System.out.println("answer=" + answer2);
												return answer2;
											}
										}

									}
								}

								long fuck = 0;// fuck记录最后一个数字的位置
								for (int i = mark + 1; i < L; i++) {
									if (i < L - 1) {
										if (str.charAt(i) < 48 || str.charAt(i) > 57) {
											fuck = i - 1;
											break;
										}
									}

									if (i == L - 1) {
										fuck = L - 1;
									}
								}
								System.out.println("264linefuck=" + fuck);
								String S = "0";

								for (int i = mark; i <= fuck; i++) {
									S = S + str.charAt(i);
								}
								System.out.println("271line S=" + S);
								S = S.substring(1);
								System.out.println(S + "www");
								int count0 = 0;
								if (S.charAt(0) == 50 - 2) {
									for (int i = 0; i < S.length(); i++) {
										if (S.charAt(i) != 50 - 2) {
											count0 = i;
											break;
										}
										if (i == S.length() - 1) {
											System.out.println("system return 0");
											return 0;
										}
									}
								}
								System.out.println("count0=" + count0);
								S = S.substring(count0);
								System.out.println("no 0: " + S);
								if (S.length() > 10) {
									System.out.println("2^31-1");
									return (int) (Math.pow(2, 31) - 1);
								}
								long answer = Long.parseLong(S.trim());
								if (answer > ((long) Math.pow(2, 31) - 1)) {
									System.out.println("2^31-1");
									return (int) (Math.pow(2, 31) - 1);
								} else {
									int b = (int) answer;
									int answer2 = b;
									System.out.println("answer=" + answer2);
									return answer2;
								}
							}
						} else {// 空格过后，第一个不是数字、负号、+，直接放弃
							return 0;
						}
					}
				}

				else {// str开头第一个是数字or+
					if (str.charAt(0) == 43) {// 开头是+
						if (str.length() == 1) {// 开头是+，长度为1
							return 0;
						} else {// 开头是+，长度大于1
							if (str.charAt(1) < 48 || str.charAt(1) > 57) {// 开头是+，后面紧跟的不是数字
								System.out.println("system return 0");
								return 0;
							} else {// 开头是+，后面紧跟数字

								str = str.substring(1);
								System.out.println("reduce + : " + str);
							}

						}
					}
					if (str.length() == 1) {// str开头为数字，且str仅有一个元素
						String S = "0";
						S = S + str.charAt(0);
						S = S.substring(1);
						System.out.println(S);

						long answer = Long.parseLong(S.trim());

						int b = (int) answer;
						int answer2 = b;
						System.out.println("answer=" + answer2);
						return answer2;

					} else {// str开头为数字，且str.length()>=2
						int fuck = 0;
						for (int i = 1; i < str.length(); i++) {
							if (str.charAt(i) < 48 || str.charAt(i) > 57) {// fuck为最后一个数字
								fuck = i - 1;
								// System.out.println("i="+i);
								break;
							}
							if (i == str.length() - 1) {
								fuck = str.length() - 1;
							}
						}

						System.out.println("232fuck=" + fuck);
						String S = "0";
						for (int i = 0; i <= fuck; i++) {
							S = S + str.charAt(i);
						}
						S = S.substring(1);
						System.out.println("238S:" + S);
						int count0 = 0;
						if (S.charAt(0) == 50 - 2) {
							for (int i = 0; i < S.length(); i++) {
								if (S.charAt(i) != 50 - 2) {
									count0 = i;
									break;
								}
								if (i == S.length() - 1) {
									System.out.println("system return 0");
									return 0;
								}
							}
						}
						System.out.println("count0=" + count0);
						S = S.substring(count0);

						System.out.println("no 0:" + S);
						if (S.length() > 10) {
							System.out.println("2^31-1");
							return (int) (Math.pow(2, 31) - 1);
						}
						System.out.println("303   :" + S);
						long answer = Long.parseLong(S.trim());
						if (answer > ((long) (Math.pow(2, 31) - 1))) {
							System.out.println("306flow  2^31-1");
							return (int) (Math.pow(2, 31) - 1);
						} else {
							int b = (int) answer;
							int answer2 = b;
							System.out.println("answer=" + answer2);
							return answer2;
						}
					}

				}
			}
		}
	}
}

public class atio extends Solutionofatio {
	public static void main(String[] args) {
		atio a = new atio();
		String str = "032";
		System.out.println("input:" + str);
		a.myAtoi(str);
	}
}
