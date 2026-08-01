package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13070e extends AbstractC17557e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C0609e f26002e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f26003e;

    public C13070e(int i, C0609e c0609e) {
        this.f26003e = i;
        this.f26002e = c0609e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f26002e.invoke(Integer.valueOf(i));
    }

    @Override // defpackage.AbstractC7674e
    public final int subs() {
        return this.f26003e;
    }
}
