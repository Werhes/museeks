package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16630e implements InterfaceC5948e {
    public final AbstractC17475e ad;
    public final int vip;

    public C16630e(int i, C1410e c1410e) {
        this.vip = i;
        this.ad = c1410e;
    }

    public static C16630e metrica(int i, C1292e c1292e) {
        InterfaceC5948e c16501e;
        String str;
        int i2 = 4;
        AbstractC17595e.metrica(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = c1292e.metrica;
        int i4 = -2;
        int i5 = 0;
        while (c1292e.ad() > 8) {
            int loadAd = c1292e.loadAd();
            int loadAd2 = c1292e.vip + c1292e.loadAd();
            c1292e.m572while(loadAd2);
            if (loadAd == 1414744396) {
                c16501e = metrica(c1292e.loadAd(), c1292e);
            } else {
                C3605e c3605e = null;
                switch (loadAd) {
                    case 1718776947:
                        if (i4 != 2) {
                            if (i4 != 1) {
                                AbstractC2803e.smaato("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC9413e.m2558native(i4));
                                break;
                            } else {
                                int pro = c1292e.pro();
                                String str2 = pro != 1 ? pro != 85 ? pro != 255 ? pro != 8192 ? pro != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int pro2 = c1292e.pro();
                                    int loadAd3 = c1292e.loadAd();
                                    c1292e.m568protected(6);
                                    int pro3 = c1292e.pro();
                                    String str3 = AbstractC9413e.ad;
                                    int m2548class = AbstractC9413e.m2548class(pro3, ByteOrder.LITTLE_ENDIAN);
                                    int pro4 = c1292e.ad() > 0 ? c1292e.pro() : 0;
                                    C11445e c11445e = new C11445e();
                                    c11445e.amazon = AbstractC8542e.amazon(str2);
                                    c11445e.f23018class = pro2;
                                    c11445e.f23021interface = loadAd3;
                                    if (str2.equals("audio/raw") && m2548class != 0) {
                                        c11445e.f23020goto = m2548class;
                                    }
                                    if (str2.equals("audio/mp4a-latm") && pro4 > 0) {
                                        byte[] bArr = new byte[pro4];
                                        c1292e.mopub(0, pro4, bArr);
                                        c11445e.admob = AbstractC17475e.ads(bArr);
                                    }
                                    c16501e = new C16501e(new C16975e(c11445e));
                                    break;
                                } else {
                                    AbstractC10257e.pro("Ignoring track with unsupported format tag ", pro, "StreamFormatChunk");
                                    break;
                                }
                            }
                        } else {
                            c1292e.m568protected(i2);
                            int loadAd4 = c1292e.loadAd();
                            int loadAd5 = c1292e.loadAd();
                            c1292e.m568protected(i2);
                            int loadAd6 = c1292e.loadAd();
                            switch (loadAd6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C11445e c11445e2 = new C11445e();
                                c11445e2.signatures = loadAd4;
                                c11445e2.tapsense = loadAd5;
                                c11445e2.amazon = AbstractC8542e.amazon(str);
                                c16501e = new C16501e(new C16975e(c11445e2));
                                break;
                            } else {
                                AbstractC10257e.pro("Ignoring track with unsupported compression ", loadAd6, "StreamFormatChunk");
                                break;
                            }
                        }
                    case 1751742049:
                        int loadAd7 = c1292e.loadAd();
                        c1292e.m568protected(8);
                        int loadAd8 = c1292e.loadAd();
                        int loadAd9 = c1292e.loadAd();
                        c1292e.m568protected(i2);
                        c1292e.loadAd();
                        c1292e.m568protected(12);
                        c16501e = new C8262e(loadAd7, loadAd8, loadAd9);
                        break;
                    case 1752331379:
                        int loadAd10 = c1292e.loadAd();
                        c1292e.m568protected(12);
                        c1292e.loadAd();
                        int loadAd11 = c1292e.loadAd();
                        int loadAd12 = c1292e.loadAd();
                        c1292e.m568protected(i2);
                        int loadAd13 = c1292e.loadAd();
                        int loadAd14 = c1292e.loadAd();
                        c1292e.m568protected(i2);
                        c3605e = new C3605e(loadAd10, loadAd11, loadAd12, loadAd13, loadAd14, c1292e.loadAd());
                        break;
                    case 1852994675:
                        c16501e = new C9732e(c1292e.isPro(c1292e.ad(), StandardCharsets.UTF_8));
                        break;
                }
                c16501e = c3605e;
            }
            if (c16501e != null) {
                if (c16501e.ad() == 1752331379) {
                    i4 = ((C3605e) c16501e).vip();
                }
                int i6 = i5 + 1;
                int vip = AbstractC13584e.vip(objArr.length, i6);
                if (vip > objArr.length) {
                    objArr = Arrays.copyOf(objArr, vip);
                }
                objArr[i5] = c16501e;
                i5 = i6;
            }
            c1292e.m571try(loadAd2);
            c1292e.m572while(i3);
            i2 = 4;
        }
        return new C16630e(i, AbstractC17475e.loadAd(i5, objArr));
    }

    @Override // defpackage.InterfaceC5948e
    public final int ad() {
        return this.vip;
    }

    public final InterfaceC5948e vip(Class cls) {
        C2171e listIterator = this.ad.listIterator(0);
        while (listIterator.hasNext()) {
            InterfaceC5948e interfaceC5948e = (InterfaceC5948e) listIterator.next();
            if (interfaceC5948e.getClass() == cls) {
                return interfaceC5948e;
            }
        }
        return null;
    }
}
