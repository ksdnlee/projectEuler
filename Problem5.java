
public class Problem5 {

	public static void main(String[] args) {
		int num = 20;
		while(true) {
			if (num%19 == 0) {
				if (num%18 == 0) {
					if (num%17 == 0) {
						if (num%16 == 0) {
							if (num%15 == 0) {
								if (num%14 == 0) {
									if (num%13 == 0) {
										if (num%12 == 0) {
											if (num%11 == 0) {
												if (num%10 == 0) {
													if (num%9 == 0) {
														if (num%8 == 0) {
															if (num%7 == 0) {
																if (num%6 == 0) {
																	if (num%5 == 0) {
																		if (num%4 == 0) {
																			if (num%3 == 0) {
																				if (num%2 == 0) {
																					System.out.println(num);
																					break;
																				}
																			}
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			num+=20;
		}
	}
}
