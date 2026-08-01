package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17361e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ EnumC6916e f34062e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C13877e f34063e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f34064e;

    public C17361e(boolean z, C13877e c13877e, EnumC6916e enumC6916e) {
        this.f34064e = z;
        this.f34063e = c13877e;
        this.f34062e = enumC6916e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e = (C13770e) obj;
        int intValue = ((Number) obj2).intValue();
        if (!c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
            c13770e.m3659default();
        } else if (this.f34064e) {
            c13770e.m3676strictfp(1808014403);
            C13877e c13877e = this.f34063e;
            EnumC6916e m3688private = c13877e.m3688private();
            EnumC6916e enumC6916e = this.f34062e;
            boolean z = m3688private == enumC6916e;
            boolean yandex = c13770e.yandex(c13877e) | c13770e.license(enumC6916e.ordinal());
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17685e(c13877e, enumC6916e, 1);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC4530e.ad(z, (Function0) m3681throw, null, false, null, c13770e, 0);
            c13770e.Signature(false);
        } else {
            c13770e.m3676strictfp(1808234968);
            AbstractC5647e.ad(AbstractC8217e.license(), null, AbstractC12220e.smaato(C0115e.f1276e, 12, 0.0f, 2), 0L, c13770e, 432, 8);
            c13770e.Signature(false);
        }
        return Unit.INSTANCE;
    }
}
