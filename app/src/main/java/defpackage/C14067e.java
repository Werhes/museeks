package defpackage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.Collections;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14067e {
    public static final /* synthetic */ InterfaceC8614e[] license = {AbstractC3820e.ad.startapp(new C11779e(C14067e.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public final String ad;
    public final InterfaceC8018e metrica;
    public final ThreadLocal vip = new ThreadLocal();

    /* JADX WARN: Type inference failed for: r1v1, types: [eٕؒ۟] */
    public C14067e(Context context, String str) {
        this.ad = str;
        final int i = 0;
        C17974e c17974e = new C17974e(22, new Function1(this) { // from class: eٕؒ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C14067e f3607e;

            {
                this.f3607e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i) {
                    case 0:
                        Log.w(AbstractC3820e.ad.vip(C14067e.class).mopub(), "CorruptionException in " + this.f3607e.ad + " DataStore running in process " + Process.myPid(), (C11506e) obj);
                        return new C0044e(true);
                    default:
                        Context context2 = (Context) obj;
                        String str2 = this.f3607e.ad;
                        InterfaceC5083e interfaceC5083e = null;
                        int i2 = 3;
                        return Collections.singletonList(new C16191e(new C1478e(i2, context2, str2), AbstractC14041e.ad, new C6369e(AbstractC10999e.ad, interfaceC5083e, 1), new C15985e(i2, 8, interfaceC5083e), context2, str2));
                }
            }
        });
        final int i2 = 1;
        C11354e license2 = AbstractC17419e.license(str, c17974e, new Function1(this) { // from class: eٕؒ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C14067e f3607e;

            {
                this.f3607e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i2) {
                    case 0:
                        Log.w(AbstractC3820e.ad.vip(C14067e.class).mopub(), "CorruptionException in " + this.f3607e.ad + " DataStore running in process " + Process.myPid(), (C11506e) obj);
                        return new C0044e(true);
                    default:
                        Context context2 = (Context) obj;
                        String str2 = this.f3607e.ad;
                        InterfaceC5083e interfaceC5083e = null;
                        int i22 = 3;
                        return Collections.singletonList(new C16191e(new C1478e(i22, context2, str2), AbstractC14041e.ad, new C6369e(AbstractC10999e.ad, interfaceC5083e, 1), new C15985e(i22, 8, interfaceC5083e), context2, str2));
                }
            }
        }, 8);
        InterfaceC8614e interfaceC8614e = license[0];
        this.metrica = (InterfaceC8018e) license2.ad(context);
    }

    public final void ad(Function1 function1) {
    }
}
