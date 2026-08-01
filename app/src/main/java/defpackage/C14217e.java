package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۚؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14217e implements InterfaceC6823e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f28084e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28085e;

    public /* synthetic */ C14217e(Context context, int i) {
        this.f28085e = i;
        this.f28084e = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, eِّؔ] */
    /* JADX WARN: Type inference failed for: r2v1, types: [eؚؗۘ, eؕٓۡ] */
    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        int i = this.f28085e;
        Context context = this.f28084e;
        switch (i) {
            case 0:
                Object obj = C13150e.adcel;
                final ?? obj2 = new Object();
                obj2.f6388e = context;
                context.getClass();
                if (((InterfaceC6823e) obj2.f6386e) == null) {
                    obj2.f6386e = C13150e.smaato;
                }
                final int i2 = 1;
                if (((InterfaceC6823e) obj2.f6385e) == null) {
                    obj2.f6385e = AbstractC5209e.billing(new C14217e((Context) obj2.f6388e, i2));
                }
                if (((C0841e) obj2.f6387e) == null) {
                    obj2.f6387e = new InterfaceC6823e() { // from class: eؒؕ۟
                        @Override // defpackage.InterfaceC6823e
                        public final Object get() {
                            int i3 = i2;
                            C2532e c2532e = obj2;
                            switch (i3) {
                                case 0:
                                    Context context2 = (Context) c2532e.f6388e;
                                    Object obj3 = C13150e.adcel;
                                    try {
                                        return AbstractC9621e.license(context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return C1444e.f4274e;
                                    }
                                default:
                                    return new C4842e(new C11931e((InterfaceC6823e) c2532e.f6386e));
                            }
                        }
                    };
                }
                final int i3 = 0;
                if (((InterfaceC6823e) obj2.f6384e) == null) {
                    Context context2 = (Context) obj2.f6388e;
                    ArrayList arrayList = new ArrayList();
                    C2923e c2923e = new C2923e(new C17214e(context2, 1));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, c2923e, new Object());
                    obj2.f6384e = AbstractC5209e.billing(new C1715e(i3, arrayList));
                }
                if (((C0841e) obj2.f6389e) == null) {
                    obj2.f6389e = new InterfaceC6823e() { // from class: eؒؕ۟
                        @Override // defpackage.InterfaceC6823e
                        public final Object get() {
                            int i32 = i3;
                            C2532e c2532e = obj2;
                            switch (i32) {
                                case 0:
                                    Context context22 = (Context) c2532e.f6388e;
                                    Object obj3 = C13150e.adcel;
                                    try {
                                        return AbstractC9621e.license(context22.getPackageManager().getApplicationInfo("com.google.android.gms", 0));
                                    } catch (PackageManager.NameNotFoundException unused) {
                                        return C1444e.f4274e;
                                    }
                                default:
                                    return new C4842e(new C11931e((InterfaceC6823e) c2532e.f6386e));
                            }
                        }
                    };
                }
                return new C13150e((Context) obj2.f6388e, (InterfaceC6823e) obj2.f6386e, (InterfaceC6823e) obj2.f6385e, (C0841e) obj2.f6387e, (InterfaceC6823e) obj2.f6384e, (C0841e) obj2.f6389e);
            case 1:
                Object obj3 = C13150e.adcel;
                return new C0582e(new AbstractC6950e(context, AbstractC6387e.ad, InterfaceC12516e.ad, C16258e.metrica));
            default:
                Object obj4 = AbstractC8119e.ad;
                return AbstractC12026e.ads(context);
        }
    }
}
