package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14862e extends AbstractC13502e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11927e f29408e;

    public C14862e(C11927e c11927e) {
        this.f29408e = c11927e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f26778e;
        this.f26778e = i + 2;
        Object[] objArr = this.f26780e;
        return new C10084e(this.f29408e, objArr[i], objArr[i + 1]);
    }
}
