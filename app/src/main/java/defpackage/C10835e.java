package defpackage;

/* renamed from: eؘُؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10835e extends C12553e {
    public static final C10835e startapp = new C12553e();

    @Override // defpackage.AbstractC2728e, defpackage.InterfaceC4665e
    public final boolean vip(C15466e c15466e, C15466e c15466e2) {
        if (c15466e.f30558e.length == c15466e2.f30558e.length) {
            C16221e[] admob = c15466e.admob();
            C16221e[] admob2 = c15466e2.admob();
            for (int i = 0; i != admob.length; i++) {
                if (AbstractC1358e.yandex(admob[i], admob2[i])) {
                }
            }
            return true;
        }
        return false;
    }
}
