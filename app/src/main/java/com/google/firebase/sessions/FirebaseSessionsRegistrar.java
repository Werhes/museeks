package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC15297e;
import defpackage.AbstractC3062e;
import defpackage.AbstractC3743e;
import defpackage.AbstractC4511e;
import defpackage.AbstractC6874e;
import defpackage.C0444e;
import defpackage.C0498e;
import defpackage.C0912e;
import defpackage.C10017e;
import defpackage.C11467e;
import defpackage.C11798e;
import defpackage.C12582e;
import defpackage.C14679e;
import defpackage.C15816e;
import defpackage.C16382e;
import defpackage.C16786e;
import defpackage.C17424e;
import defpackage.C18464e;
import defpackage.C18478e;
import defpackage.C2691e;
import defpackage.C3168e;
import defpackage.C5891e;
import defpackage.C7259e;
import defpackage.C7693e;
import defpackage.C7988e;
import defpackage.C8055e;
import defpackage.C8625e;
import defpackage.C9237e;
import defpackage.C9770e;
import defpackage.InterfaceC10123e;
import defpackage.InterfaceC11846e;
import defpackage.InterfaceC12823e;
import defpackage.InterfaceC18006e;
import defpackage.InterfaceC2560e;
import defpackage.InterfaceC4648e;
import defpackage.InterfaceC7549e;
import defpackage.InterfaceC7970e;
import defpackage.InterfaceC8850e;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", BuildConfig.FLAVOR, "Leؚؚٚ;", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "eًٛۘ", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final C8055e Companion = new Object();
    private static final C16786e appContext = C16786e.ad(Context.class);
    private static final C16786e firebaseApp = C16786e.ad(C14679e.class);
    private static final C16786e firebaseInstallationsApi = C16786e.ad(InterfaceC4648e.class);
    private static final C16786e backgroundDispatcher = new C16786e(InterfaceC7549e.class, AbstractC3743e.class);
    private static final C16786e blockingDispatcher = new C16786e(InterfaceC10123e.class, AbstractC3743e.class);
    private static final C16786e transportFactory = C16786e.ad(InterfaceC11846e.class);
    private static final C16786e firebaseSessionsComponent = C16786e.ad(InterfaceC12823e.class);

    public static final C16382e getComponents$lambda$0(InterfaceC2560e interfaceC2560e) {
        return (C16382e) ((C0498e) ((InterfaceC12823e) interfaceC2560e.inmobi(firebaseSessionsComponent))).Signature.get();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, eؑۗؓ, eُّۢ] */
    public static final InterfaceC12823e getComponents$lambda$1(InterfaceC2560e interfaceC2560e) {
        Context context = (Context) interfaceC2560e.inmobi(appContext);
        InterfaceC8850e interfaceC8850e = (InterfaceC8850e) interfaceC2560e.inmobi(backgroundDispatcher);
        InterfaceC8850e interfaceC8850e2 = (InterfaceC8850e) interfaceC2560e.inmobi(blockingDispatcher);
        C14679e c14679e = (C14679e) interfaceC2560e.inmobi(firebaseApp);
        InterfaceC4648e interfaceC4648e = (InterfaceC4648e) interfaceC2560e.inmobi(firebaseInstallationsApi);
        InterfaceC7970e advert = interfaceC2560e.advert(transportFactory);
        ?? obj = new Object();
        obj.ad = C15816e.signatures(c14679e);
        C15816e signatures = C15816e.signatures(context);
        obj.vip = signatures;
        obj.metrica = C7693e.ad(new C9770e(13, signatures));
        obj.license = C7693e.ad(AbstractC3062e.ad);
        obj.appmetrica = C15816e.signatures(interfaceC4648e);
        obj.purchase = C7693e.ad(new C2691e(7, obj.ad));
        C15816e signatures2 = C15816e.signatures(interfaceC8850e2);
        obj.billing = signatures2;
        obj.yandex = C7693e.ad(new C11798e(obj.purchase, signatures2));
        obj.startapp = C15816e.signatures(interfaceC8850e);
        obj.adcel = C7693e.ad(new C5891e(obj.metrica, C7693e.ad(new C18464e(obj.license, obj.appmetrica, obj.purchase, obj.yandex, C7693e.ad(new C0912e(4, obj.startapp, obj.license, C7693e.ad(new C17424e(obj.vip, obj.billing, false, 20)))), 21)), 14));
        InterfaceC18006e ad = C7693e.ad(AbstractC15297e.ad);
        obj.mopub = ad;
        obj.advert = C7693e.ad(new C3168e(obj.license, ad, 13));
        obj.smaato = C7693e.ad(new C18464e(obj.ad, obj.appmetrica, obj.adcel, C7693e.ad(new C0444e(C15816e.signatures(advert))), obj.startapp, 26));
        obj.amazon = C7693e.ad(new C18478e(18, obj.vip, obj.billing, C7693e.ad(new C9770e(22, obj.advert))));
        InterfaceC18006e ad2 = C7693e.ad(new C10017e(obj.adcel, obj.advert, obj.smaato, obj.license, obj.amazon, C7693e.ad(new C11798e(obj.vip, obj.mopub)), obj.startapp));
        obj.loadAd = ad2;
        obj.Signature = C7693e.ad(new C11467e(obj.ad, obj.adcel, obj.startapp, C7693e.ad(new C7988e(23, ad2))));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C7259e> getComponents() {
        C9237e vip = C7259e.vip(C16382e.class);
        vip.ad = LIBRARY_NAME;
        vip.ad(C8625e.ad(firebaseSessionsComponent));
        vip.billing = new C12582e(19);
        vip.metrica(2);
        C7259e vip2 = vip.vip();
        C9237e vip3 = C7259e.vip(InterfaceC12823e.class);
        vip3.ad = "fire-sessions-component";
        vip3.ad(C8625e.ad(appContext));
        vip3.ad(C8625e.ad(backgroundDispatcher));
        vip3.ad(C8625e.ad(blockingDispatcher));
        vip3.ad(C8625e.ad(firebaseApp));
        vip3.ad(C8625e.ad(firebaseInstallationsApi));
        vip3.ad(new C8625e(transportFactory, 1, 1));
        vip3.billing = new C12582e(20);
        return AbstractC6874e.startapp(vip2, vip3.vip(), AbstractC4511e.vip(LIBRARY_NAME, "3.0.4"));
    }
}
