package defpackage;

import android.app.Activity;
import android.content.Intent;
import java.text.DecimalFormat;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔ٘ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2642e implements Function3 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15252e f6513e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6514e;

    public /* synthetic */ C2642e(C15252e c15252e, int i) {
        this.f6514e = i;
        this.f6513e = c15252e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f6514e;
        C0115e c0115e = C0115e.f1276e;
        final C15252e c15252e = this.f6513e;
        final int i2 = 1;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                C13770e c13770e = (C13770e) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 17) != 16)) {
                    String str = c15252e.f30185e;
                    C15492e c15492e = AbstractC11785e.ad;
                    AbstractC14489e.vip(str, AbstractC18007e.metrica(c0115e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, new C7975e(5), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 48, 0, 130040);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f = AbstractC11992e.ad;
                    long j = C3618e.startapp;
                    C8872e ad = AbstractC11992e.ad(j, 0L, 0L, 0L, c13770e2, 510);
                    InterfaceC12864e metrica = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex = c13770e2.yandex(c15252e);
                    Object m3681throw = c13770e2.m3681throw();
                    C5170e c5170e = C2987e.ad;
                    if (yandex || m3681throw == c5170e) {
                        final Object[] objArr2 = objArr == true ? 1 : 0;
                        m3681throw = new Function0() { // from class: eُۡؕ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = objArr2;
                                C15252e c15252e2 = c15252e;
                                switch (i3) {
                                    case 0:
                                        DecimalFormat decimalFormat = C5575e.ad;
                                        C5575e.ad(c15252e2.f30185e);
                                        c15252e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        Activity activity = c15252e2.f10582e;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", c15252e2.f30185e);
                                        intent.setFlags(1);
                                        intent.setType("text/plain");
                                        activity.startActivity(Intent.createChooser(intent, c15252e2.f10582e.getResources().getText(R.string.share)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC16429e.ad(AbstractC15077e.ad, AbstractC9546e.license(metrica, false, null, (Function0) m3681throw, 15), null, null, AbstractC15077e.vip, null, ad, 0.0f, 0.0f, c13770e2, 24582, 428);
                    AbstractC8141e.vip(null, 0.0f, 0L, c13770e2, 0, 7);
                    C8872e ad2 = AbstractC11992e.ad(j, 0L, 0L, 0L, c13770e2, 510);
                    InterfaceC12864e metrica2 = AbstractC18007e.metrica(c0115e, 1.0f);
                    boolean yandex2 = c13770e2.yandex(c15252e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == c5170e) {
                        m3681throw2 = new Function0() { // from class: eُۡؕ
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i3 = i2;
                                C15252e c15252e2 = c15252e;
                                switch (i3) {
                                    case 0:
                                        DecimalFormat decimalFormat = C5575e.ad;
                                        C5575e.ad(c15252e2.f30185e);
                                        c15252e2.purchase();
                                        return Unit.INSTANCE;
                                    default:
                                        Activity activity = c15252e2.f10582e;
                                        Intent intent = new Intent();
                                        intent.setAction("android.intent.action.SEND");
                                        intent.putExtra("android.intent.extra.TEXT", c15252e2.f30185e);
                                        intent.setFlags(1);
                                        intent.setType("text/plain");
                                        activity.startActivity(Intent.createChooser(intent, c15252e2.f10582e.getResources().getText(R.string.share)));
                                        return Unit.INSTANCE;
                                }
                            }
                        };
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC16429e.ad(AbstractC15077e.metrica, AbstractC9546e.license(metrica2, false, null, (Function0) m3681throw2, 15), null, null, AbstractC15077e.license, null, ad2, 0.0f, 0.0f, c13770e2, 24582, 428);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
