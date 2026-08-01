package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؐؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8385e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8054e f17150e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17151e;

    public /* synthetic */ C8385e(C8054e c8054e, int i) {
        this.f17151e = i;
        this.f17150e = c8054e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17151e) {
            case 0:
                ((Boolean) obj).getClass();
                this.f17150e.f16363e.setValue(Boolean.valueOf(!r7.ads()));
                return Unit.INSTANCE;
            case 1:
                C0398e c0398e = (C0398e) obj;
                String str = c0398e.ad.f20850e;
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                this.f17150e.f16366e.setValue(C0398e.vip(c0398e, sb.toString()));
                return Unit.INSTANCE;
            default:
                ((Boolean) obj).getClass();
                this.f17150e.f16365e.setValue(Boolean.valueOf(!r7.applovin()));
                return Unit.INSTANCE;
        }
    }
}
