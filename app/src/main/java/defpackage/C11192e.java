package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11192e extends AbstractC13438e {
    public final C13199e yandex;

    public C11192e(C13199e c13199e) {
        this.yandex = c13199e;
    }

    @Override // defpackage.AbstractC13438e
    public final void metrica(Object obj) {
        C15172e c15172e = this.yandex.ad;
        if (c15172e == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
        c15172e.metrica(obj);
    }
}
