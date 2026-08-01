package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6783e extends AbstractC13502e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f13991e;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13991e) {
            case 0:
                int i = this.f26778e;
                this.f26778e = i + 2;
                Object[] objArr = this.f26780e;
                return new C2672e(objArr[i], objArr[i + 1], 0);
            case 1:
                int i2 = this.f26778e;
                this.f26778e = i2 + 2;
                return this.f26780e[i2];
            default:
                int i3 = this.f26778e;
                this.f26778e = i3 + 2;
                return this.f26780e[i3 + 1];
        }
    }
}
