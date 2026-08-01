package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14275e extends AbstractC16858e implements Function0 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C0758e f28241e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f28242e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9292e f28243e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ long f28244e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14275e(AbstractC9292e abstractC9292e, long j, long j2, C0758e c0758e) {
        super(0);
        this.f28243e = abstractC9292e;
        this.f28242e = j;
        this.f28244e = j2;
        this.f28241e = c0758e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AbstractC9292e abstractC9292e = this.f28243e;
        abstractC9292e.m2538e().f8014e = false;
        abstractC9292e.m2538e().f8012e = this.f28242e;
        abstractC9292e.m2538e().f8011e = this.f28244e;
        Function1 license = this.f28241e.f3051e.license();
        if (license != null) {
            license.invoke(abstractC9292e.m2538e());
        }
        return Unit.INSTANCE;
    }
}
