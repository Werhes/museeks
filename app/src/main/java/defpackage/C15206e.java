package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15206e {
    public final Object ad;
    public final int vip;

    public C15206e(Object obj) {
        this.ad = obj;
        if (obj instanceof String) {
            this.vip = 1;
        } else {
            if (!(obj instanceof C6541e)) {
                throw new IllegalArgumentException();
            }
            this.vip = 2;
        }
    }
}
