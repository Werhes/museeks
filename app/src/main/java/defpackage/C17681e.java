package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُ٘ٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17681e {
    public final C13506e ad;
    public final String vip;

    public C17681e(C13506e c13506e) {
        this(c13506e, c13506e.f7267e);
    }

    public C17681e(C13506e c13506e, String str) {
        this.ad = c13506e;
        this.vip = str;
    }

    public final Object ad(Object obj, Object obj2) {
        C13506e c13506e = this.ad;
        Object obj3 = c13506e.get(obj);
        if (obj3 == null) {
            c13506e.remoteconfig(obj, obj2);
            return null;
        }
        if (obj3.equals(obj2)) {
            return null;
        }
        return obj3;
    }
}
