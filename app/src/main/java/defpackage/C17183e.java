package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17183e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C0943e f33691e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33692e;

    public /* synthetic */ C17183e(C0943e c0943e, int i) {
        this.f33692e = i;
        this.f33691e = c0943e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        switch (this.f33692e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    AbstractC14489e.vip(this.f33691e.f3363e, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e, 0, 24960, 241662);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    C15347e c15347e = this.f33691e.f3370e;
                    String str = c15347e != null ? c15347e.f30271e : null;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    AbstractC14489e.vip(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, c13770e2, 0, 24960, 241662);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    int ordinal = this.f33691e.f3368e.ordinal();
                    if (ordinal != 0) {
                        i = R.drawable.ic_sync_outline_28;
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                i = R.drawable.ic_newsfeed_outline_28;
                            } else if (ordinal == 3) {
                                i = R.drawable.ic_error_outline_28;
                            } else if (ordinal == 4) {
                                i = R.drawable.ic_gift_outline_28;
                            } else if (ordinal != 5) {
                                throw new C14803e(10);
                            }
                        }
                    } else {
                        i = R.drawable.ic_mail_outline_28;
                    }
                    AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e3), null, null, 0L, c13770e3, 56, 12);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
