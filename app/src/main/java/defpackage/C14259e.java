package defpackage;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14259e extends Cpackage {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC10716e f28190e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f28191e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f28192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14259e(C4390e c4390e, String str) {
        super(12);
        this.f28191e = 2;
        this.f28190e = c4390e;
        this.f28192e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14259e(Object obj, AbstractC15876e abstractC15876e, int i) {
        super(12);
        this.f28191e = i;
        this.f28192e = obj;
        this.f28190e = abstractC15876e;
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًؕۙ */
    public final AbstractC18406e mo774e() {
        switch (this.f28191e) {
            case 0:
                return new C4600e((String) this.f28192e, 4);
            case 1:
                return (AbstractC18406e) ((Function0) this.f28192e).invoke();
            default:
                return new C4600e(26, (String) ((C4390e) this.f28190e).f9568e.getValue(), (String) this.f28192e, false);
        }
    }

    @Override // defpackage.Cpackage
    /* renamed from: eًۛٝ */
    public final boolean mo2058e() {
        switch (this.f28191e) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eۦؕ, java.lang.Object] */
    @Override // defpackage.Cpackage
    /* renamed from: eَٕٞ */
    public final AbstractC18491e mo2059e() {
        switch (this.f28191e) {
            case 0:
                return new C17256e((C5522e) this.f28190e, false, true, 102);
            case 1:
                return new C17256e((C15767e) this.f28190e, false, true, 118);
            default:
                return new Object();
        }
    }
}
