package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6408e implements InterfaceC14173e, InterfaceC16205e, InterfaceC12504e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C17148e f13281e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13282e;

    public /* synthetic */ C6408e(C17148e c17148e, int i) {
        this.f13282e = i;
        this.f13281e = c17148e;
    }

    @Override // defpackage.InterfaceC16205e
    public void ad(Object obj, Object obj2) {
        ((Integer) obj).getClass();
        Integer num = (Integer) obj2;
        int intValue = num.intValue();
        C17148e c17148e = this.f13281e;
        c17148e.m4251e();
        c17148e.m4254e(1, 10, num);
        c17148e.m4254e(2, 10, num);
        c17148e.f33577e.billing(21, new C6802e(intValue, 1));
    }

    @Override // defpackage.InterfaceC14173e
    public void adcel(Object obj, C11715e c11715e) {
        ((InterfaceC8524e) obj).subs(this.f13281e.f33632e, new C3164e(c11715e));
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
        switch (this.f13282e) {
            case 3:
                interfaceC8524e.mo1488goto(this.f13281e.f33636e);
                return;
            default:
                interfaceC8524e.mo1480abstract(this.f13281e.f33617e);
                return;
        }
    }
}
