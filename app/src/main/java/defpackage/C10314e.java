package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10314e extends AbstractC7904e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C9689e f20363e;

    public C10314e(C9689e c9689e) {
        this.f20363e = c9689e;
    }

    @Override // defpackage.AbstractC7904e
    public final String yandex() {
        C7169e c7169e = (C7169e) this.f20363e.f19185e.get();
        if (c7169e == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + c7169e.ad + "]";
    }
}
