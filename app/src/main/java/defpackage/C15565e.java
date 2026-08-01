package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eِٕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15565e<C> {
    public static final C10048e Companion = new Object();
    public static final C4707e metrica;
    public final List ad;
    public final int vip;

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؕ۠, java.lang.Object] */
    static {
        C4707e c4707e = new C4707e("com.arkivanov.decompose.router.pages.SerializablePages", null, 2);
        c4707e.advert("items", false);
        c4707e.advert("selectedIndex", false);
        metrica = c4707e;
    }

    public /* synthetic */ C15565e(int i, int i2, List list) {
        if (3 != (i & 3)) {
            AbstractC5756e.billing(i, 3, metrica);
            throw null;
        }
        this.ad = list;
        this.vip = i2;
    }

    public C15565e(int i, List list) {
        this.ad = list;
        this.vip = i;
    }
}
