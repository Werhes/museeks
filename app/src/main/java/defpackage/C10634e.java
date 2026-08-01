package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10634e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C6064e f20954e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f20955e;

    public /* synthetic */ C10634e(C6064e c6064e, int i) {
        this.f20955e = i;
        this.f20954e = c6064e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String license;
        int i2 = this.f20955e;
        C6064e c6064e = this.f20954e;
        switch (i2) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    EnumC10783e enumC10783e = c6064e.ad;
                    switch (enumC10783e != null ? AbstractC8016e.ad[enumC10783e.ordinal()] : -1) {
                        case 1:
                            i = R.string.auth2_method_sms_method_title;
                            break;
                        case 2:
                            i = R.string.auth2_method_push_method_title;
                            break;
                        case 3:
                            i = R.string.auth2_method_email_method_title;
                            break;
                        case 4:
                            i = R.string.auth2_method_codegen_method_title;
                            break;
                        case 5:
                            i = R.string.auth2_method_callreset_method_title;
                            break;
                        case 6:
                            i = R.string.auth2_password_method_title;
                            break;
                        default:
                            i = R.string.auth2_method_reserve_method_title;
                            break;
                    }
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e, i), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e, 0, 0, 262142);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    EnumC10783e enumC10783e2 = c6064e.ad;
                    String str = c6064e.license;
                    if (str == null) {
                        str = BuildConfig.FLAVOR;
                    }
                    switch (enumC10783e2 != null ? AbstractC8016e.ad[enumC10783e2.ordinal()] : -1) {
                        case 1:
                        case 2:
                        case 3:
                            c13770e2.m3676strictfp(-2128981090);
                            license = AbstractC5297e.license(R.string.auth2_method_with_info, new Object[]{str}, c13770e2);
                            c13770e2.Signature(false);
                            break;
                        case 4:
                            license = AbstractC4653e.isVip(c13770e2, 1455334387, R.string.auth2_method_codegen_method_desc, c13770e2, false);
                            break;
                        case 5:
                            license = AbstractC4653e.isVip(c13770e2, 1455330837, R.string.auth2_method_callreset_method_desc, c13770e2, false);
                            break;
                        case 6:
                            license = AbstractC4653e.isVip(c13770e2, 1455337901, R.string.auth2_password_method_desc, c13770e2, false);
                            break;
                        default:
                            license = AbstractC4653e.isVip(c13770e2, 1455346643, R.string.auth2_method_reserve_method_desc, c13770e2, false);
                            break;
                    }
                    AbstractC14489e.vip(license, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e2, 0, 0, 262142);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Number) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(AbstractC11463e.subscription(c6064e.ad), 0, c13770e3), null, null, 0L, c13770e3, 56, 12);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
