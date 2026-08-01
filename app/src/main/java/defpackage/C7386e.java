package defpackage;

import java.math.BigDecimal;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7386e extends AbstractC13345e {
    public final /* synthetic */ int ad;

    public /* synthetic */ C7386e(int i) {
        this.ad = i;
    }

    @Override // defpackage.AbstractC13345e
    public final void purchase(AbstractC3442e abstractC3442e, Object obj) {
        switch (this.ad) {
            case 0:
                abstractC3442e.ads((String) obj);
                return;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C12867e c12867e = (C12867e) abstractC3442e;
                if (c12867e.f7699e) {
                    throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + c12867e.advert());
                }
                c12867e.m3411protected();
                c12867e.subs();
                c12867e.f25705e.mo2631private(booleanValue ? "true" : "false");
                int[] iArr = c12867e.f7702e;
                int i = c12867e.f7703e - 1;
                iArr[i] = iArr[i] + 1;
                return;
            case 2:
                abstractC3442e.inmobi(((Byte) obj).intValue() & 255);
                return;
            case 3:
                abstractC3442e.ads(((Character) obj).toString());
                return;
            case 4:
                double doubleValue = ((Double) obj).doubleValue();
                C12867e c12867e2 = (C12867e) abstractC3442e;
                c12867e2.getClass();
                if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + doubleValue);
                }
                if (c12867e2.f7699e) {
                    c12867e2.f7699e = false;
                    c12867e2.loadAd(Double.toString(doubleValue));
                    return;
                }
                c12867e2.m3411protected();
                c12867e2.subs();
                c12867e2.f25705e.mo2631private(Double.toString(doubleValue));
                int[] iArr2 = c12867e2.f7702e;
                int i2 = c12867e2.f7703e - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                C12867e c12867e3 = (C12867e) abstractC3442e;
                c12867e3.getClass();
                String obj2 = f.toString();
                if (obj2.equals("-Infinity") || obj2.equals("Infinity") || obj2.equals("NaN")) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + f);
                }
                if (c12867e3.f7699e) {
                    c12867e3.f7699e = false;
                    c12867e3.loadAd(obj2);
                    return;
                }
                c12867e3.m3411protected();
                c12867e3.subs();
                c12867e3.f25705e.mo2631private(obj2);
                int[] iArr3 = c12867e3.f7702e;
                int i3 = c12867e3.f7703e - 1;
                iArr3[i3] = iArr3[i3] + 1;
                return;
            case 6:
                abstractC3442e.inmobi(((Integer) obj).intValue());
                return;
            case 7:
                abstractC3442e.inmobi(((Long) obj).longValue());
                return;
            default:
                abstractC3442e.inmobi(((Short) obj).intValue());
                return;
        }
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return "JsonAdapter(String)";
            case 1:
                return "JsonAdapter(Boolean)";
            case 2:
                return "JsonAdapter(Byte)";
            case 3:
                return "JsonAdapter(Character)";
            case 4:
                return "JsonAdapter(Double)";
            case 5:
                return "JsonAdapter(Float)";
            case 6:
                return "JsonAdapter(Integer)";
            case 7:
                return "JsonAdapter(Long)";
            default:
                return "JsonAdapter(Short)";
        }
    }

    @Override // defpackage.AbstractC13345e
    public final Object vip(AbstractC17080e abstractC17080e) {
        long parseLong;
        switch (this.ad) {
            case 0:
                return abstractC17080e.subs();
            case 1:
                C7720e c7720e = (C7720e) abstractC17080e;
                int i = c7720e.f15669e;
                if (i == 0) {
                    i = c7720e.m2315new();
                }
                boolean z = false;
                if (i == 5) {
                    c7720e.f15669e = 0;
                    int[] iArr = c7720e.f33420e;
                    int i2 = c7720e.f33421e - 1;
                    iArr[i2] = iArr[i2] + 1;
                    z = true;
                } else {
                    if (i != 6) {
                        throw new C14803e("Expected a boolean but was " + AbstractC0869e.crashlytics(c7720e.crashlytics()) + " at path " + c7720e.loadAd(), 8, (byte) 0);
                    }
                    c7720e.f15669e = 0;
                    int[] iArr2 = c7720e.f33420e;
                    int i3 = c7720e.f33421e - 1;
                    iArr2[i3] = iArr2[i3] + 1;
                }
                return Boolean.valueOf(z);
            case 2:
                return Byte.valueOf((byte) AbstractC11750e.yandex(abstractC17080e, "a byte", -128, 255));
            case 3:
                String subs = abstractC17080e.subs();
                if (subs.length() <= 1) {
                    return Character.valueOf(subs.charAt(0));
                }
                throw new C14803e(AbstractC17861e.admob("Expected a char but was ", AbstractC17861e.advert('\"', "\"", subs), " at path ", abstractC17080e.loadAd()), 8, (byte) 0);
            case 4:
                return Double.valueOf(abstractC17080e.isVip());
            case 5:
                float isVip = (float) abstractC17080e.isVip();
                if (!Float.isInfinite(isVip)) {
                    return Float.valueOf(isVip);
                }
                throw new C14803e("JSON forbids NaN and infinities: " + isVip + " at path " + abstractC17080e.loadAd(), 8, (byte) 0);
            case 6:
                return Integer.valueOf(abstractC17080e.inmobi());
            case 7:
                C7720e c7720e2 = (C7720e) abstractC17080e;
                int i4 = c7720e2.f15669e;
                if (i4 == 0) {
                    i4 = c7720e2.m2315new();
                }
                if (i4 == 16) {
                    c7720e2.f15669e = 0;
                    int[] iArr3 = c7720e2.f33420e;
                    int i5 = c7720e2.f33421e - 1;
                    iArr3[i5] = iArr3[i5] + 1;
                    parseLong = c7720e2.f15667e;
                } else {
                    if (i4 == 17) {
                        C16151e c16151e = c7720e2.f15670e;
                        long j = c7720e2.f15668e;
                        c16151e.getClass();
                        c7720e2.f15666e = c16151e.mo1683e(j, AbstractC5508e.ad);
                    } else if (i4 == 9 || i4 == 8) {
                        String m2309e = i4 == 9 ? c7720e2.m2309e(C7720e.f15663e) : c7720e2.m2309e(C7720e.f15664e);
                        c7720e2.f15666e = m2309e;
                        try {
                            parseLong = Long.parseLong(m2309e);
                            c7720e2.f15669e = 0;
                            int[] iArr4 = c7720e2.f33420e;
                            int i6 = c7720e2.f33421e - 1;
                            iArr4[i6] = iArr4[i6] + 1;
                        } catch (NumberFormatException unused) {
                        }
                    } else if (i4 != 11) {
                        throw new C14803e("Expected a long but was " + AbstractC0869e.crashlytics(c7720e2.crashlytics()) + " at path " + c7720e2.loadAd(), 8, (byte) 0);
                    }
                    c7720e2.f15669e = 11;
                    try {
                        parseLong = new BigDecimal(c7720e2.f15666e).longValueExact();
                        c7720e2.f15666e = null;
                        c7720e2.f15669e = 0;
                        int[] iArr5 = c7720e2.f33420e;
                        int i7 = c7720e2.f33421e - 1;
                        iArr5[i7] = iArr5[i7] + 1;
                    } catch (ArithmeticException | NumberFormatException unused2) {
                        throw new C14803e("Expected a long but was " + c7720e2.f15666e + " at path " + c7720e2.loadAd(), 8, (byte) 0);
                    }
                }
                return Long.valueOf(parseLong);
            default:
                return Short.valueOf((short) AbstractC11750e.yandex(abstractC17080e, "a short", -32768, 32767));
        }
    }
}
