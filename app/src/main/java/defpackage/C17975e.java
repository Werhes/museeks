package defpackage;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Magnifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ٘ۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17975e implements InterfaceC15277e, InterfaceC15588e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final C17975e f35236e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C17975e f35235e = new Object();

    public static Typeface adcel(String str, C1812e c1812e, int i) {
        if (i == 0 && AbstractC7890e.billing(c1812e, C1812e.f4893e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1812e.f4894e, i == 1);
    }

    public static Unit appmetrica(RemoteAction remoteAction) {
        PendingIntent actionIntent = remoteAction.getActionIntent();
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC5666e.m1955class(actionIntent);
        } else {
            actionIntent.send();
        }
        return Unit.INSTANCE;
    }

    public static String billing(RemoteAction remoteAction, C13770e c13770e) {
        c13770e.m3676strictfp(-1376593684);
        String obj = remoteAction.getTitle().toString();
        c13770e.Signature(false);
        return obj;
    }

    public static String license(TextClassification textClassification, C13770e c13770e) {
        c13770e.m3676strictfp(950061013);
        String valueOf = String.valueOf(textClassification.getLabel());
        c13770e.Signature(false);
        return valueOf;
    }

    public static void mopub(C8024e c8024e, Context context, C15304e c15304e) {
        if (context == null) {
            return;
        }
        int i = c15304e.metrica;
        TextClassification textClassification = c15304e.vip;
        if (i < 0) {
            C3450e c3450e = new C3450e(19, textClassification);
            Drawable icon = textClassification.getIcon();
            C8024e.vip(c8024e, c3450e, icon != null ? new C2892e(-1123224187, true, new C11783e(5, icon)) : null, new C5565e(context, textClassification, 24), 6);
        } else {
            RemoteAction remoteAction = textClassification.getActions().get(i);
            C8024e.vip(c8024e, new C3450e(20, remoteAction), ((i == 0) || remoteAction.shouldShowIcon()) ? new C2892e(-1261173016, true, new C7245e(remoteAction)) : null, new C5671e(15, remoteAction), 6);
        }
    }

    @Override // defpackage.InterfaceC15277e
    public boolean ad() {
        return false;
    }

    @Override // defpackage.InterfaceC15588e
    public Typeface metrica(int i, C1812e c1812e) {
        return adcel(null, c1812e, i);
    }

    @Override // defpackage.InterfaceC15588e
    public Typeface purchase(C7492e c7492e, C1812e c1812e, int i) {
        return adcel(c7492e.f15263e, c1812e, i);
    }

    public void startapp(final Icon icon, C13770e c13770e, final int i) {
        C2846e subscription;
        Function2 function2;
        c13770e.m3671package(2116504409);
        int i2 = (c13770e.yandex(icon) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) c13770e.adcel(AbstractC2676e.vip);
            boolean purchase = c13770e.purchase(icon) | c13770e.purchase(context);
            Object m3681throw = c13770e.m3681throw();
            if (purchase || m3681throw == C2987e.ad) {
                m3681throw = icon.loadDrawable(context);
                c13770e.m3682throws(m3681throw);
            }
            Drawable drawable = (Drawable) m3681throw;
            if (drawable == null) {
                subscription = c13770e.subscription();
                if (subscription != null) {
                    final int i3 = 0;
                    function2 = new Function2(this, icon, i, i3) { // from class: eؓٙۖ

                        /* renamed from: eًؔؐ, reason: contains not printable characters */
                        public final /* synthetic */ Icon f5044e;

                        /* renamed from: eؘٙؓ, reason: contains not printable characters */
                        public final /* synthetic */ C17975e f5045e;

                        /* renamed from: eّٖۦ, reason: contains not printable characters */
                        public final /* synthetic */ int f5046e;

                        {
                            this.f5046e = i3;
                            this.f5045e = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.f5046e;
                            C13770e c13770e2 = (C13770e) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    this.f5045e.startapp(this.f5044e, c13770e2, AbstractC5190e.advert(49));
                                    return Unit.INSTANCE;
                                default:
                                    this.f5045e.startapp(this.f5044e, c13770e2, AbstractC5190e.advert(49));
                                    return Unit.INSTANCE;
                            }
                        }
                    };
                    subscription.license = function2;
                }
                return;
            }
            yandex(drawable, c13770e, 48);
        } else {
            c13770e.m3659default();
        }
        subscription = c13770e.subscription();
        if (subscription != null) {
            final int i4 = 1;
            function2 = new Function2(this, icon, i, i4) { // from class: eؓٙۖ

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Icon f5044e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ C17975e f5045e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ int f5046e;

                {
                    this.f5046e = i4;
                    this.f5045e = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.f5046e;
                    C13770e c13770e2 = (C13770e) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            this.f5045e.startapp(this.f5044e, c13770e2, AbstractC5190e.advert(49));
                            return Unit.INSTANCE;
                        default:
                            this.f5045e.startapp(this.f5044e, c13770e2, AbstractC5190e.advert(49));
                            return Unit.INSTANCE;
                    }
                }
            };
            subscription.license = function2;
        }
    }

    @Override // defpackage.InterfaceC15277e
    public InterfaceC9178e vip(View view, boolean z, long j, float f, float f2, boolean z2, InterfaceC14388e interfaceC14388e, float f3) {
        return new C17760e(new Magnifier(view));
    }

    public void yandex(Drawable drawable, C13770e c13770e, int i) {
        c13770e.m3671package(257732500);
        int i2 = (c13770e.yandex(drawable) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            InterfaceC12864e startapp = AbstractC18007e.startapp(C0115e.f1276e, AbstractC16226e.adcel);
            boolean yandex = c13770e.yandex(drawable);
            Object m3681throw = c13770e.m3681throw();
            if (yandex || m3681throw == C2987e.ad) {
                m3681throw = new C17955e(8, drawable);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17074e.ad(AbstractC5750e.metrica(startapp, (Function1) m3681throw), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, drawable, i, 8);
        }
    }
}
