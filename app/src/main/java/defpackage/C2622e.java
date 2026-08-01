package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2622e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C16070e f6483e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6484e;

    public /* synthetic */ C2622e(C16070e c16070e, int i) {
        this.f6484e = 1;
        this.f6483e = c16070e;
    }

    public /* synthetic */ C2622e(C16070e c16070e, int i, byte b) {
        this.f6484e = i;
        this.f6483e = c16070e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0108. Please report as an issue. */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6484e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C16070e c16070e = this.f6483e;
                    AbstractC10560e.ad(AbstractC16653e.license(835595713, new C2622e(c16070e, 2, (byte) 0), c13770e), null, AbstractC16653e.license(762011135, new C2622e(c16070e, 3, (byte) 0), c13770e), null, 0.0f, null, null, null, c13770e, 390, 506);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                this.f6483e.mo212final((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    int ordinal = this.f6483e.m4107strictfp().ad.ordinal();
                    int i = R.drawable.ic_phone_outline_28;
                    switch (ordinal) {
                        case 0:
                            i = R.drawable.ic_message_outline_28;
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        case 1:
                            i = R.drawable.ic_smartphone_outline_28;
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        case 2:
                            i = R.drawable.ic_mail_outline_28;
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        case 3:
                            i = R.drawable.ic_pincode_lock_outline_28;
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        case 4:
                        case 5:
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        case 6:
                            i = R.drawable.ic_article_outline_28;
                            AbstractC5647e.vip(AbstractC12475e.metrica(i, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                            break;
                        default:
                            throw new C14803e(10);
                    }
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C16070e c16070e2 = this.f6483e;
                    boolean yandex = c13770e3.yandex(c16070e2);
                    Object m3681throw = c13770e3.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C17011e(0, c16070e2, C16070e.class, "onNavigationIconClicked", "onNavigationIconClicked()V", 0, 0, 24);
                        c13770e3.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) ((InterfaceC5261e) m3681throw), null, false, null, null, null, AbstractC2728e.ad, c13770e3, 1572864, 62);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                CharSequence charSequence = (CharSequence) obj2;
                this.f6483e.getClass();
                StringBuilder sb = new StringBuilder();
                int length = charSequence.length();
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = charSequence.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                return sb;
            default:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC14489e.vip((String) this.f6483e.f31645e.getValue(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
