package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* renamed from: eٍِۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9419e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Function0 f18751e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C16746e f18752e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4246e f18753e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final ClassLoader f18754e;

    public C9419e(ClassLoader classLoader, C16746e c16746e, Function0 function0, C4246e c4246e) {
        this.f18754e = classLoader;
        this.f18752e = c16746e;
        this.f18751e = function0;
        this.f18753e = c4246e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        C17653e c17653e = (C17653e) obj2;
        C15199e c15199e = this.f18751e == null ? null : new C15199e(new C4804e(this.f18753e, 0), ((Number) obj).intValue(), 0);
        if (AbstractC7890e.billing(c17653e, C17653e.metrica)) {
            return C5538e.metrica;
        }
        int i2 = c17653e.ad;
        if (i2 != 0) {
            int m2467class = AbstractC8703e.m2467class(i2);
            i = 1;
            if (m2467class != 0) {
                if (m2467class == 1) {
                    i = 2;
                } else {
                    if (m2467class != 2) {
                        throw new C14803e(10);
                    }
                    i = 3;
                }
            }
        } else {
            i = 0;
        }
        C0632e c0632e = c17653e.vip;
        return new C5538e(i, c0632e != null ? AbstractC1396e.amazon(c0632e, this.f18754e, this.f18752e, c15199e) : null);
    }
}
