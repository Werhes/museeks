package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18347e extends AbstractC12098e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f36018e = -1;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C15577e f36019e;

    public C18347e(C15577e c15577e) {
        this.f36019e = c15577e;
    }

    @Override // defpackage.AbstractC12098e
    public final void ad() {
        int i;
        Object[] objArr;
        do {
            i = this.f36018e + 1;
            this.f36018e = i;
            objArr = this.f36019e.f30748e;
            if (i >= objArr.length) {
                break;
            }
        } while (objArr[i] == null);
        if (i >= objArr.length) {
            this.f24255e = 2;
        } else {
            this.f24254e = objArr[i];
            this.f24255e = 1;
        }
    }
}
