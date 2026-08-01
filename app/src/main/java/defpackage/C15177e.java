package defpackage;

import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؒٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15177e extends Cpackage {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f30026e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f30027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15177e(int i, Object obj) {
        super(12);
        this.f30026e = i;
        this.f30027e = obj;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًؕۙ */
    public final AbstractC18406e mo774e() {
        switch (this.f30026e) {
            case 0:
                return (AbstractC18406e) ((Function0) this.f30027e).invoke();
            case 1:
                return (AbstractC18406e) ((C9837e) this.f30027e).invoke();
            case 2:
                return new C4600e(BuildConfig.FLAVOR, 12);
            default:
                return new C4600e(14, (String) ((C0567e) this.f30027e).f2743e.getValue(), null, !AbstractC5304e.m1866native(r0));
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًۛٝ */
    public boolean mo2058e() {
        switch (this.f30026e) {
            case 1:
                return false;
            case 2:
                return false;
            case 3:
                return false;
            default:
                return super.mo2058e();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eۦؕ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.Cpackage
    /* renamed from: eَٕٞ */
    public AbstractC18491e mo2059e() {
        switch (this.f30026e) {
            case 1:
                return new Object();
            case 2:
                C0568e c0568e = new C0568e(6);
                C16031e c16031e = (C16031e) this.f30027e;
                return new C9456e(c0568e, new C12851e(14, c16031e), null, new C2109e(28, c16031e), true, false, null, 100);
            case 3:
                return new Object();
            default:
                return super.mo2059e();
        }
    }
}
