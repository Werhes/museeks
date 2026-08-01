package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؕ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14500e extends AbstractC14681e {
    public final AbstractC17475e metrica;
    public final String vip;

    public C14500e(String str, String str2, C1410e c1410e) {
        super(str);
        AbstractC2301e.billing(!c1410e.isEmpty());
        this.vip = str2;
        AbstractC17475e remoteconfig = AbstractC17475e.remoteconfig(c1410e);
        this.metrica = remoteconfig;
    }

    public static ArrayList license(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14500e.class == obj.getClass()) {
            C14500e c14500e = (C14500e) obj;
            if (Objects.equals(this.ad, c14500e.ad) && Objects.equals(this.vip, c14500e.vip) && this.metrica.equals(c14500e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(527, 31, this.ad);
        String str = this.vip;
        return this.metrica.hashCode() + ((advert + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": description=" + this.vip + ": values=" + this.metrica;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.AbstractC14681e, defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        char c;
        String str = this.ad;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        AbstractC17475e abstractC17475e = this.metrica;
        try {
            switch (c) {
                case 0:
                case '\n':
                    c4761e.metrica = (CharSequence) abstractC17475e.get(0);
                    return;
                case 1:
                case 11:
                    c4761e.ads = (CharSequence) abstractC17475e.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) abstractC17475e.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    c4761e.signatures = Integer.valueOf(parseInt);
                    c4761e.tapsense = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    c4761e.vip = (CharSequence) abstractC17475e.get(0);
                    return;
                case 4:
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    c4761e.license = (CharSequence) abstractC17475e.get(0);
                    return;
                case 5:
                case 20:
                    c4761e.premium = (CharSequence) abstractC17475e.get(0);
                    return;
                case 6:
                case 21:
                    String str3 = (String) abstractC17475e.get(0);
                    String str4 = AbstractC9413e.ad;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    Integer valueOf = split.length > 1 ? Integer.valueOf(Integer.parseInt(split[1])) : null;
                    c4761e.loadAd = Integer.valueOf(parseInt3);
                    c4761e.Signature = valueOf;
                    return;
                case 7:
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    c4761e.ad = (CharSequence) abstractC17475e.get(0);
                    return;
                case '\b':
                case 16:
                    c4761e.applovin = (CharSequence) abstractC17475e.get(0);
                    return;
                case '\t':
                case 22:
                    c4761e.pro = Integer.valueOf(Integer.parseInt((String) abstractC17475e.get(0)));
                    return;
                case '\f':
                    Integer admob = AbstractC10509e.admob((String) abstractC17475e.get(0));
                    if (admob == null) {
                        c4761e.firebase = (CharSequence) abstractC17475e.get(0);
                        return;
                    }
                    String ad = AbstractC15404e.ad(admob.intValue());
                    if (ad != null) {
                        c4761e.firebase = ad;
                        return;
                    }
                    return;
                case 14:
                    ArrayList license = license((String) abstractC17475e.get(0));
                    int size = license.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size != 3) {
                                return;
                            } else {
                                c4761e.tapsense = (Integer) license.get(2);
                            }
                        }
                        c4761e.signatures = (Integer) license.get(1);
                    }
                    c4761e.pro = (Integer) license.get(0);
                    return;
                case 15:
                    ArrayList license2 = license((String) abstractC17475e.get(0));
                    int size2 = license2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 != 3) {
                                return;
                            } else {
                                c4761e.isPro = (Integer) license2.get(2);
                            }
                        }
                        c4761e.inmobi = (Integer) license2.get(1);
                    }
                    c4761e.isVip = (Integer) license2.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }
}
