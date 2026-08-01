package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5904e extends AbstractC10149e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C4510e f12462e;

    public AbstractC5904e(C4510e c4510e) {
        this.f12462e = c4510e;
    }

    @Override // defpackage.AbstractC10149e
    /* renamed from: goto, reason: not valid java name */
    public final C11614e mo2003goto(C4070e c4070e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC11263e.inmobi(this, AbstractC5797e.vip(ExecutorC3603e.f8134e, new C5621e("cio-to-nio-writer")), c4070e, new C7669e(this, c4070e, this.f12462e, ((C8689e) this).f17531e, null));
    }

    @Override // defpackage.AbstractC10149e
    public final Throwable isVip() {
        C4510e c4510e = this.f12462e;
        try {
            ((C8689e) this).f17531e.close();
            close();
            c4510e.crashlytics(this);
            return null;
        } catch (Throwable th) {
            c4510e.crashlytics(this);
            return th;
        }
    }

    @Override // defpackage.AbstractC10149e
    public final C17269e subs(C4070e c4070e) {
        C15420e c15420e = AbstractC6731e.ad;
        return AbstractC12534e.adcel(this, AbstractC5797e.vip(ExecutorC3603e.f8134e, new C5621e("cio-from-nio-reader")), c4070e, new C12778e(this, c4070e, ((C8689e) this).f17531e, this.f12462e, null));
    }
}
