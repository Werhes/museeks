package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6765e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC9512e f13968e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13969e;

    public /* synthetic */ C6765e(AbstractC9512e abstractC9512e, int i) {
        this.f13969e = i;
        this.f13968e = abstractC9512e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f13969e) {
            case 0:
                AbstractC9512e abstractC9512e = this.f13968e;
                AbstractC5336e.purchase(AbstractC4608e.metrica(abstractC9512e.vip()), null, 0, new C8643e(abstractC9512e, null, 1), 3);
                return Unit.INSTANCE;
            case 1:
                AbstractC8647e.admob(this.f13968e.pro());
                return Unit.INSTANCE;
            case 2:
                this.f13968e.f18868e.setValue(BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case 3:
                AbstractC9512e abstractC9512e2 = this.f13968e;
                AbstractC5336e.purchase(AbstractC4608e.metrica(abstractC9512e2.vip()), null, 0, new C8643e(abstractC9512e2, null, 0), 3);
                return Unit.INSTANCE;
            default:
                new C3779e(new C3119e(), 2).signatures(this.f13968e.pro());
                return Unit.INSTANCE;
        }
    }
}
