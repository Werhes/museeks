package defpackage;

import android.text.SpannableStringBuilder;
import androidx.car.app.navigation.model.Maneuver;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0355e extends AbstractC13965e {
    public C2125e Signature;
    public int admob;
    public final C1019e[] advert;
    public List amazon;
    public List loadAd;
    public final int mopub;
    public C1019e smaato;
    public final C1292e yandex = new C1292e();
    public final C2125e startapp = new C2125e();
    public int adcel = -1;

    public C0355e(int i, List list) {
        this.mopub = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = AbstractC13612e.ad;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.advert = new C1019e[8];
        for (int i2 = 0; i2 < 8; i2++) {
            this.advert[i2] = new C1019e();
        }
        this.smaato = this.advert[0];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x0143. Please report as an issue. */
    public final void adcel() {
        char c;
        int i;
        boolean z;
        C2125e c2125e = this.Signature;
        if (c2125e == null) {
            return;
        }
        int i2 = 2;
        if (c2125e.appmetrica != (c2125e.license * 2) - 1) {
            AbstractC2803e.license("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.Signature.license * 2) - 1) + ", but current index is " + this.Signature.appmetrica + " (sequence number " + this.Signature.metrica + ");");
        }
        C2125e c2125e2 = this.Signature;
        byte[] bArr = c2125e2.vip;
        int i3 = c2125e2.appmetrica;
        C2125e c2125e3 = this.startapp;
        c2125e3.mopub(i3, bArr);
        boolean z2 = false;
        while (true) {
            if (c2125e3.vip() > 0) {
                int i4 = 3;
                int billing = c2125e3.billing(3);
                int billing2 = c2125e3.billing(5);
                if (billing == 7) {
                    c2125e3.loadAd(i2);
                    billing = c2125e3.billing(6);
                    if (billing < 7) {
                        AbstractC10257e.pro("Invalid extended service number: ", billing, "Cea708Decoder");
                    }
                }
                if (billing2 == 0) {
                    if (billing != 0) {
                        AbstractC2803e.smaato("Cea708Decoder", "serviceNumber is non-zero (" + billing + ") when blockSize is 0");
                    }
                } else if (billing != this.mopub) {
                    c2125e3.Signature(billing2);
                } else {
                    int appmetrica = (billing2 * 8) + c2125e3.appmetrica();
                    while (c2125e3.appmetrica() < appmetrica) {
                        int billing3 = c2125e3.billing(8);
                        if (billing3 != 16) {
                            if (billing3 <= 31) {
                                if (billing3 != 0) {
                                    if (billing3 == i4) {
                                        this.amazon = mopub();
                                    } else if (billing3 != 8) {
                                        switch (billing3) {
                                            case 12:
                                                advert();
                                                break;
                                            case 13:
                                                this.smaato.ad('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (billing3 < 17 || billing3 > 23) {
                                                    if (billing3 < 24 || billing3 > 31) {
                                                        AbstractC10257e.pro("Invalid C0 command: ", billing3, "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        AbstractC2803e.smaato("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + billing3);
                                                        c2125e3.loadAd(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC2803e.smaato("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + billing3);
                                                    c2125e3.loadAd(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.smaato.vip;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i2;
                            } else if (billing3 <= 127) {
                                if (billing3 == 127) {
                                    this.smaato.ad((char) 9835);
                                } else {
                                    this.smaato.ad((char) (billing3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (billing3 <= 159) {
                                    C1019e[] c1019eArr = this.advert;
                                    switch (billing3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z = true;
                                            int i5 = billing3 - 128;
                                            if (this.admob != i5) {
                                                this.admob = i5;
                                                this.smaato = c1019eArr[i5];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (c2125e3.purchase()) {
                                                    C1019e c1019e = c1019eArr[8 - i6];
                                                    c1019e.ad.clear();
                                                    c1019e.vip.clear();
                                                    c1019e.loadAd = -1;
                                                    c1019e.Signature = -1;
                                                    c1019e.admob = -1;
                                                    c1019e.remoteconfig = -1;
                                                    c1019e.signatures = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (c2125e3.purchase()) {
                                                    c1019eArr[8 - i7].license = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 138:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (c2125e3.purchase()) {
                                                    c1019eArr[8 - i8].license = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 139:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (c2125e3.purchase()) {
                                                    c1019eArr[8 - i9].license = !r1.license;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (c2125e3.purchase()) {
                                                    c1019eArr[8 - i10].license();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 141:
                                            c2125e3.loadAd(8);
                                            z = true;
                                            break;
                                        case 142:
                                            z = true;
                                            break;
                                        case 143:
                                            advert();
                                            z = true;
                                            break;
                                        case 144:
                                            int i11 = i2;
                                            if (!this.smaato.metrica) {
                                                c2125e3.loadAd(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                c2125e3.billing(4);
                                                c2125e3.billing(i11);
                                                c2125e3.billing(i11);
                                                boolean purchase = c2125e3.purchase();
                                                boolean purchase2 = c2125e3.purchase();
                                                i4 = 3;
                                                c2125e3.billing(3);
                                                c2125e3.billing(3);
                                                this.smaato.appmetrica(purchase, purchase2);
                                                z = true;
                                            }
                                        case 145:
                                            if (this.smaato.metrica) {
                                                int metrica = C1019e.metrica(c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2));
                                                int metrica2 = C1019e.metrica(c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2));
                                                c2125e3.loadAd(2);
                                                C1019e.metrica(c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2), 0);
                                                this.smaato.purchase(metrica, metrica2);
                                            } else {
                                                c2125e3.loadAd(24);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 146:
                                            if (this.smaato.metrica) {
                                                c2125e3.loadAd(4);
                                                int billing4 = c2125e3.billing(4);
                                                c2125e3.loadAd(2);
                                                c2125e3.billing(6);
                                                C1019e c1019e2 = this.smaato;
                                                if (c1019e2.signatures != billing4) {
                                                    c1019e2.ad('\n');
                                                }
                                                c1019e2.signatures = billing4;
                                            } else {
                                                c2125e3.loadAd(16);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC10257e.pro("Invalid C1 command: ", billing3, "Cea708Decoder");
                                            z = true;
                                            break;
                                        case 151:
                                            if (this.smaato.metrica) {
                                                int metrica3 = C1019e.metrica(c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2));
                                                c2125e3.billing(2);
                                                C1019e.metrica(c2125e3.billing(2), c2125e3.billing(2), c2125e3.billing(2), 0);
                                                c2125e3.purchase();
                                                c2125e3.purchase();
                                                c2125e3.billing(2);
                                                c2125e3.billing(2);
                                                int billing5 = c2125e3.billing(2);
                                                c2125e3.loadAd(8);
                                                C1019e c1019e3 = this.smaato;
                                                c1019e3.amazon = metrica3;
                                                c1019e3.mopub = billing5;
                                            } else {
                                                c2125e3.loadAd(32);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i12 = billing3 - 152;
                                            C1019e c1019e4 = c1019eArr[i12];
                                            c2125e3.loadAd(i2);
                                            boolean purchase3 = c2125e3.purchase();
                                            c2125e3.loadAd(i2);
                                            int billing6 = c2125e3.billing(i4);
                                            boolean purchase4 = c2125e3.purchase();
                                            int billing7 = c2125e3.billing(7);
                                            int billing8 = c2125e3.billing(8);
                                            int billing9 = c2125e3.billing(4);
                                            int billing10 = c2125e3.billing(4);
                                            c2125e3.loadAd(i2);
                                            c2125e3.loadAd(6);
                                            c2125e3.loadAd(i2);
                                            int billing11 = c2125e3.billing(3);
                                            int billing12 = c2125e3.billing(3);
                                            ArrayList arrayList = c1019e4.ad;
                                            c1019e4.metrica = true;
                                            c1019e4.license = purchase3;
                                            c1019e4.appmetrica = billing6;
                                            c1019e4.purchase = purchase4;
                                            c1019e4.billing = billing7;
                                            c1019e4.yandex = billing8;
                                            c1019e4.startapp = billing9;
                                            int i13 = billing10 + 1;
                                            if (c1019e4.adcel != i13) {
                                                c1019e4.adcel = i13;
                                                while (true) {
                                                    if (arrayList.size() >= c1019e4.adcel || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (billing11 != 0 && c1019e4.advert != billing11) {
                                                c1019e4.advert = billing11;
                                                int i14 = billing11 - 1;
                                                int i15 = C1019e.premium[i14];
                                                boolean z3 = C1019e.ads[i14];
                                                int i16 = C1019e.isPro[i14];
                                                int i17 = C1019e.applovin[i14];
                                                int i18 = C1019e.inmobi[i14];
                                                c1019e4.amazon = i15;
                                                c1019e4.mopub = i18;
                                            }
                                            if (billing12 != 0 && c1019e4.smaato != billing12) {
                                                c1019e4.smaato = billing12;
                                                int i19 = billing12 - 1;
                                                int i20 = C1019e.crashlytics[i19];
                                                int i21 = C1019e.subs[i19];
                                                c1019e4.appmetrica(false, false);
                                                c1019e4.purchase(C1019e.tapsense, C1019e.firebase[i19]);
                                            }
                                            if (this.admob != i12) {
                                                this.admob = i12;
                                                this.smaato = c1019eArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (billing3 <= 255) {
                                        this.smaato.ad((char) (billing3 & 255));
                                    } else {
                                        AbstractC10257e.pro("Invalid base command: ", billing3, "Cea708Decoder");
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int billing13 = c2125e3.billing(8);
                            if (billing13 <= 31) {
                                c = 7;
                                if (billing13 > 7) {
                                    if (billing13 <= 15) {
                                        c2125e3.loadAd(8);
                                    } else if (billing13 <= 23) {
                                        c2125e3.loadAd(16);
                                    } else if (billing13 <= 31) {
                                        c2125e3.loadAd(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (billing13 <= 127) {
                                    if (billing13 == 32) {
                                        this.smaato.ad(' ');
                                    } else if (billing13 == 33) {
                                        this.smaato.ad((char) 160);
                                    } else if (billing13 == 37) {
                                        this.smaato.ad((char) 8230);
                                    } else if (billing13 == 42) {
                                        this.smaato.ad((char) 352);
                                    } else if (billing13 == 44) {
                                        this.smaato.ad((char) 338);
                                    } else if (billing13 == 63) {
                                        this.smaato.ad((char) 376);
                                    } else if (billing13 == 57) {
                                        this.smaato.ad((char) 8482);
                                    } else if (billing13 == 58) {
                                        this.smaato.ad((char) 353);
                                    } else if (billing13 == 60) {
                                        this.smaato.ad((char) 339);
                                    } else if (billing13 != 61) {
                                        switch (billing13) {
                                            case 48:
                                                this.smaato.ad((char) 9608);
                                                break;
                                            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                                                this.smaato.ad((char) 8216);
                                                break;
                                            case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                                                this.smaato.ad((char) 8217);
                                                break;
                                            case 51:
                                                this.smaato.ad((char) 8220);
                                                break;
                                            case 52:
                                                this.smaato.ad((char) 8221);
                                                break;
                                            case 53:
                                                this.smaato.ad((char) 8226);
                                                break;
                                            default:
                                                switch (billing13) {
                                                    case 118:
                                                        this.smaato.ad((char) 8539);
                                                        break;
                                                    case 119:
                                                        this.smaato.ad((char) 8540);
                                                        break;
                                                    case 120:
                                                        this.smaato.ad((char) 8541);
                                                        break;
                                                    case 121:
                                                        this.smaato.ad((char) 8542);
                                                        break;
                                                    case 122:
                                                        this.smaato.ad((char) 9474);
                                                        break;
                                                    case 123:
                                                        this.smaato.ad((char) 9488);
                                                        break;
                                                    case 124:
                                                        this.smaato.ad((char) 9492);
                                                        break;
                                                    case 125:
                                                        this.smaato.ad((char) 9472);
                                                        break;
                                                    case 126:
                                                        this.smaato.ad((char) 9496);
                                                        break;
                                                    case 127:
                                                        this.smaato.ad((char) 9484);
                                                        break;
                                                    default:
                                                        AbstractC10257e.pro("Invalid G2 character: ", billing13, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.smaato.ad((char) 8480);
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (billing13 > 159) {
                                    i = 2;
                                    if (billing13 <= 255) {
                                        if (billing13 == 160) {
                                            this.smaato.ad((char) 13252);
                                        } else {
                                            AbstractC10257e.pro("Invalid G3 character: ", billing13, "Cea708Decoder");
                                            this.smaato.ad('_');
                                        }
                                        z2 = true;
                                    } else {
                                        AbstractC10257e.pro("Invalid extended command: ", billing13, "Cea708Decoder");
                                    }
                                } else if (billing13 <= 135) {
                                    c2125e3.loadAd(32);
                                } else if (billing13 <= 143) {
                                    c2125e3.loadAd(40);
                                } else if (billing13 <= 159) {
                                    i = 2;
                                    c2125e3.loadAd(2);
                                    c2125e3.loadAd(c2125e3.billing(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.amazon = mopub();
        }
        this.Signature = null;
    }

    public final void advert() {
        for (int i = 0; i < 8; i++) {
            this.advert[i].license();
        }
    }

    @Override // defpackage.AbstractC13965e
    public final void billing(C6040e c6040e) {
        ByteBuffer byteBuffer = c6040e.f15296e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C1292e c1292e = this.yandex;
        c1292e.m570throw(limit, array);
        while (c1292e.ad() >= 3) {
            int ads = c1292e.ads();
            int i = ads & 3;
            boolean z = (ads & 4) == 4;
            byte ads2 = (byte) c1292e.ads();
            byte ads3 = (byte) c1292e.ads();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        adcel();
                        int i2 = (ads2 & 192) >> 6;
                        int i3 = this.adcel;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            advert();
                            AbstractC2803e.smaato("Cea708Decoder", "Sequence number discontinuity. previous=" + this.adcel + " current=" + i2);
                        }
                        this.adcel = i2;
                        int i4 = ads2 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        C2125e c2125e = new C2125e(i2, i4);
                        this.Signature = c2125e;
                        byte[] bArr = c2125e.vip;
                        c2125e.appmetrica = 1;
                        bArr[0] = ads3;
                    } else {
                        AbstractC2301e.billing(i == 2);
                        C2125e c2125e2 = this.Signature;
                        if (c2125e2 == null) {
                            AbstractC2803e.purchase("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c2125e2.vip;
                            int i5 = c2125e2.appmetrica;
                            int i6 = i5 + 1;
                            c2125e2.appmetrica = i6;
                            bArr2[i5] = ads2;
                            c2125e2.appmetrica = i5 + 2;
                            bArr2[i6] = ads3;
                        }
                    }
                    C2125e c2125e3 = this.Signature;
                    if (c2125e3.appmetrica == (c2125e3.license * 2) - 1) {
                        adcel();
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC13965e, defpackage.InterfaceC6145e
    public final void flush() {
        super.flush();
        this.amazon = null;
        this.loadAd = null;
        this.admob = 0;
        this.smaato = this.advert[0];
        advert();
        this.Signature = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List mopub() {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0355e.mopub():java.util.List");
    }

    @Override // defpackage.AbstractC13965e
    public final C9770e purchase() {
        List list = this.amazon;
        this.loadAd = list;
        list.getClass();
        return new C9770e(4, list);
    }

    @Override // defpackage.AbstractC13965e
    public final boolean startapp() {
        return this.amazon != this.loadAd;
    }
}
