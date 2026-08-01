package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11785e {
    public static final C15492e ad;

    /* JADX WARN: Type inference failed for: r1v2, types: [eۣؖۢ, eٕٕۦ] */
    static {
        AbstractC1101e.startapp(new C14136e(3));
        ad = new AbstractC4455e(new C14136e(4));
    }

    public static final void ad(C9553e c9553e, InterfaceC17372e interfaceC17372e, C17500e c17500e, C0984e c0984e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        int i3;
        char c;
        c13770e.m3671package(904511636);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(c9553e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (c13770e.purchase(interfaceC17372e) ? 32 : 16) | (c13770e.purchase(c17500e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.purchase(c0984e) ? 2048 : 1024);
        if ((i & 24576) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 16384 : 8192;
        }
        if (c13770e.m3673protected(i4 & 1, (i4 & 9363) != 9362)) {
            c13770e.m3655case();
            if ((i & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            C7019e c7019e = new C7019e(c9553e, c0984e, c17500e, interfaceC17372e);
            C13822e ad2 = AbstractC17052e.ad(0.0f, 7, 0L, false);
            long j = c9553e.ad;
            boolean appmetrica = c13770e.appmetrica(j);
            Object m3681throw = c13770e.m3681throw();
            if (appmetrica || m3681throw == C2987e.ad) {
                i3 = 0;
                c = 1;
                m3681throw = new C15331e(j, C3618e.vip(0.4f, j));
                c13770e.m3682throws(m3681throw);
            } else {
                i3 = 0;
                c = 1;
            }
            C14815e ad3 = ad.ad(c7019e);
            C14815e ad4 = AbstractC10746e.ad.ad(ad2);
            C14815e ad5 = AbstractC8389e.ad.ad((C15331e) m3681throw);
            C14815e[] c14815eArr = new C14815e[3];
            c14815eArr[i3] = ad3;
            c14815eArr[c] = ad4;
            c14815eArr[2] = ad5;
            AbstractC1101e.vip(c14815eArr, AbstractC16653e.license(-1750539308, new C0010e(c0984e, c2892e, i3), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4280e(c9553e, interfaceC17372e, c17500e, c0984e, c2892e, i);
        }
    }
}
