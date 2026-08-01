package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6819e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14050e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f14051e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f14052e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14053e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14054e = 1;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14055e;

    public /* synthetic */ C6819e(Context context, ResolveInfo resolveInfo, boolean z, CharSequence charSequence, long j) {
        this.f14053e = context;
        this.f14050e = resolveInfo;
        this.f14052e = z;
        this.f14055e = charSequence;
        this.f14051e = j;
    }

    public /* synthetic */ C6819e(C4036e c4036e, ArrayList arrayList, boolean z, long j, C14856e c14856e) {
        this.f14053e = c4036e;
        this.f14050e = arrayList;
        this.f14052e = z;
        this.f14051e = j;
        this.f14055e = c14856e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f14054e) {
            case 0:
                C4036e c4036e = (C4036e) this.f14053e;
                final ArrayList arrayList = (ArrayList) this.f14050e;
                final C14856e c14856e = (C14856e) this.f14055e;
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                final boolean z = this.f14052e;
                final long j = this.f14051e;
                Function1 function1 = new Function1() { // from class: eًٞۦ
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean z2;
                        boolean z3;
                        List list;
                        int i;
                        C16446e c16446e;
                        AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj2;
                        ArrayList arrayList2 = arrayList;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            C13668e c13668e = (C13668e) arrayList2.get(i2);
                            boolean mo398transient = c14856e.f29400e.mo398transient();
                            boolean z4 = c13668e.license;
                            if (c13668e.loadAd == Integer.MIN_VALUE) {
                                AbstractC8889e.ad("position() should be called first");
                            }
                            List list2 = c13668e.metrica;
                            int i3 = 0;
                            for (int size2 = list2.size(); i3 < size2; size2 = i) {
                                AbstractC2832e abstractC2832e = (AbstractC2832e) list2.get(i3);
                                int i4 = c13668e.Signature - (z4 ? abstractC2832e.f6804e : abstractC2832e.f6806e);
                                int i5 = c13668e.admob;
                                int i6 = i2;
                                long j2 = c13668e.pro;
                                ArrayList arrayList3 = arrayList2;
                                int i7 = size;
                                C0110e vip = c13668e.adcel.vip(i3, c13668e.vip);
                                if (vip != null) {
                                    if (mo398transient) {
                                        vip.subscription = j2;
                                        z2 = mo398transient;
                                        z3 = z4;
                                        list = list2;
                                        i = size2;
                                    } else {
                                        z2 = mo398transient;
                                        z3 = z4;
                                        list = list2;
                                        i = size2;
                                        long license = C11490e.license(!C11490e.vip(vip.subscription, C0110e.remoteconfig) ? vip.subscription : j2, ((C11490e) vip.admob.getValue()).ad);
                                        if ((c13668e.ad(j2) <= i4 && c13668e.ad(license) <= i4) || (c13668e.ad(j2) >= i5 && c13668e.ad(license) >= i5)) {
                                            vip.vip();
                                        }
                                        j2 = license;
                                    }
                                    c16446e = vip.amazon;
                                } else {
                                    z2 = mo398transient;
                                    z3 = z4;
                                    list = list2;
                                    i = size2;
                                    c16446e = null;
                                }
                                if (z) {
                                    int i8 = z3 ? (int) (j2 >> 32) : (c13668e.loadAd - ((int) (j2 >> 32))) - (z3 ? abstractC2832e.f6804e : abstractC2832e.f6806e);
                                    j2 = ((z3 ? (c13668e.loadAd - ((int) (j2 & 4294967295L))) - (z3 ? abstractC2832e.f6804e : abstractC2832e.f6806e) : (int) (j2 & 4294967295L)) & 4294967295L) | (i8 << 32);
                                }
                                long license2 = C11490e.license(j2, j);
                                if (!z2 && vip != null) {
                                    vip.smaato = license2;
                                }
                                if (c16446e != null) {
                                    AbstractC3698e.loadAd(abstractC3698e2, abstractC2832e, license2, c16446e);
                                } else {
                                    AbstractC3698e.amazon(abstractC3698e2, abstractC2832e, license2);
                                }
                                i3++;
                                mo398transient = z2;
                                i2 = i6;
                                arrayList2 = arrayList3;
                                size = i7;
                                z4 = z3;
                                list2 = list;
                            }
                            i2++;
                        }
                        return Unit.INSTANCE;
                    }
                };
                abstractC3698e.f8274e = true;
                function1.invoke(abstractC3698e);
                abstractC3698e.f8274e = false;
                c4036e.ad.signatures.getValue();
                return Unit.INSTANCE;
            default:
                Context context = (Context) this.f14053e;
                ResolveInfo resolveInfo = (ResolveInfo) this.f14050e;
                CharSequence charSequence = (CharSequence) this.f14055e;
                AbstractC5546e.vip.invoke(context, resolveInfo, Boolean.valueOf(this.f14052e), charSequence, new C12347e(this.f14051e));
                ((InterfaceC10601e) obj).close();
                return Unit.INSTANCE;
        }
    }
}
