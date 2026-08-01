package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5498e extends Throwable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f11781e;

    public C5498e(boolean z, boolean z2, C1295e c1295e, Object obj) {
        this.f11781e = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z + ",didLookahead=" + z2 + ",anchors=" + c1295e + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f11781e;
    }
}
