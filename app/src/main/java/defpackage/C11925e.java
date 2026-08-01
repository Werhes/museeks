package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: eِٜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11925e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final AbstractC4362e f23903e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8624e f23904e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23905e;

    public /* synthetic */ C11925e(C8624e c8624e, AbstractC4362e abstractC4362e, int i) {
        this.f23905e = i;
        this.f23904e = c8624e;
        this.f23903e = abstractC4362e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f23905e) {
            case 0:
                return AbstractC4511e.loadAd(this.f23904e.ad.keySet(), this.f23903e.loadAd());
            default:
                return AbstractC4511e.loadAd(this.f23904e.vip.keySet(), this.f23903e.Signature());
        }
    }
}
