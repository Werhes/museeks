package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6939e extends C16806e {

    /* renamed from: extends, reason: not valid java name */
    public C9284e f14229extends;

    /* renamed from: native, reason: not valid java name */
    public final Map f14230native;

    public C6939e(InterfaceC16970e interfaceC16970e, InterfaceC14469e interfaceC14469e, C15683e c15683e, Map map) {
        super(interfaceC16970e, interfaceC14469e, c15683e);
        this.f14230native = map;
    }

    @Override // defpackage.C16806e
    public final C16975e loadAd(C16975e c16975e) {
        C9284e c9284e;
        C9284e c9284e2 = this.f14229extends;
        if (c9284e2 == null) {
            c9284e2 = c16975e.remoteconfig;
        }
        if (c9284e2 != null && (c9284e = (C9284e) this.f14230native.get(c9284e2.f18504e)) != null) {
            c9284e2 = c9284e;
        }
        C17750e c17750e = c16975e.advert;
        C17750e c17750e2 = null;
        if (c17750e != null) {
            InterfaceC16707e[] interfaceC16707eArr = c17750e.ad;
            int length = interfaceC16707eArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    i2 = -1;
                    break;
                }
                InterfaceC16707e interfaceC16707e = interfaceC16707eArr[i2];
                if ((interfaceC16707e instanceof C10852e) && "com.apple.streaming.transportStreamTimestamp".equals(((C10852e) interfaceC16707e).vip)) {
                    break;
                }
                i2++;
            }
            if (i2 != -1) {
                if (length != 1) {
                    InterfaceC16707e[] interfaceC16707eArr2 = new InterfaceC16707e[length - 1];
                    while (i < length) {
                        if (i != i2) {
                            interfaceC16707eArr2[i < i2 ? i : i - 1] = interfaceC16707eArr[i];
                        }
                        i++;
                    }
                    c17750e2 = new C17750e(interfaceC16707eArr2);
                }
            }
            if (c9284e2 == c16975e.remoteconfig || c17750e != c16975e.advert) {
                C11445e ad = c16975e.ad();
                ad.subscription = c9284e2;
                ad.mopub = c17750e;
                c16975e = new C16975e(ad);
            }
            return super.loadAd(c16975e);
        }
        c17750e = c17750e2;
        if (c9284e2 == c16975e.remoteconfig) {
        }
        C11445e ad2 = c16975e.ad();
        ad2.subscription = c9284e2;
        ad2.mopub = c17750e;
        c16975e = new C16975e(ad2);
        return super.loadAd(c16975e);
    }
}
