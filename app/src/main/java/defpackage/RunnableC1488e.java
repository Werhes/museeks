package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1488e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f4357e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17790e f4358e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4359e;

    public /* synthetic */ RunnableC1488e(C17790e c17790e, int i, Object obj) {
        this.f4359e = i;
        this.f4358e = c17790e;
        this.f4357e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4359e) {
            case 0:
                C17790e c17790e = this.f4358e;
                if (c17790e.f34880e == 0) {
                    c17790e.m4429implements(this.f4357e);
                    return;
                }
                return;
            default:
                C17790e c17790e2 = this.f4358e;
                int i = c17790e2.f34880e - 1;
                c17790e2.f34880e = i;
                if (i == 0) {
                    c17790e2.m4429implements(this.f4357e);
                    return;
                }
                return;
        }
    }
}
