package defpackage;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.versionedparcelable.ParcelImpl;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12534e {
    public static final C3966e ad = new C3966e(2);

    public static final void ad(C13770e c13770e, InterfaceC12864e interfaceC12864e) {
        C3783e c3783e = C3783e.adcel;
        long j = c13770e.f27286case;
        int i = (int) (j ^ (j >>> 32));
        InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, interfaceC12864e);
        InterfaceC3483e advert = c13770e.advert();
        InterfaceC5685e.mopub.getClass();
        C7309e c7309e = C2721e.vip;
        c13770e.m3666import();
        if (c13770e.f27292implements) {
            c13770e.mopub(c7309e);
        } else {
            c13770e.m3684volatile();
        }
        AbstractC2270e.yandex(c13770e, c3783e, C2721e.billing);
        AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
        AbstractC2270e.purchase(c13770e, C2721e.mopub);
        AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
        AbstractC2270e.yandex(c13770e, Integer.valueOf(i), C2721e.adcel);
        c13770e.Signature(true);
    }

    public static final C17269e adcel(InterfaceC18435e interfaceC18435e, InterfaceC8850e interfaceC8850e, C4070e c4070e, Function2 function2) {
        C8419e purchase = AbstractC5336e.purchase(interfaceC18435e, interfaceC8850e, 0, new C9409e(function2, c4070e, null, 1), 2);
        purchase.mo692else(new C9693e(c4070e, 2));
        return new C17269e(c4070e, purchase);
    }

    public static void appmetrica(Bundle bundle, InterfaceC11282e interfaceC11282e) {
        if (interfaceC11282e == null) {
            bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", null);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("a", new ParcelImpl(interfaceC11282e));
        bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
    }

    public static final Object billing(InterfaceC1618e interfaceC1618e, byte b, AbstractC10731e abstractC10731e) {
        interfaceC1618e.appmetrica().m3339goto(b);
        Object billing = AbstractC15710e.billing(interfaceC1618e, abstractC10731e);
        return billing == EnumC2821e.f6782e ? billing : Unit.INSTANCE;
    }

    public static final void license(TextView textView, int i) {
        C13448e c13448e;
        Object obj;
        if (textView.getId() == -1 || textView.getId() == 0) {
            textView.setId(View.generateViewId());
        }
        AbstractC12315e.smaato(textView, ColorStateList.valueOf(AbstractC15933e.ad(i)));
        Object tag = textView.getTag(R.id.theme_tag);
        if (tag == null || !(tag instanceof C13448e)) {
            c13448e = new C13448e();
            textView.setTag(R.id.theme_tag, c13448e);
        } else {
            c13448e = (C13448e) tag;
        }
        ArrayList arrayList = c13448e.vip;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((C4683e) obj).ad == R.attr.drawableTint) {
                    break;
                }
            }
        }
        C4683e c4683e = (C4683e) obj;
        if (c4683e == null) {
            arrayList.add(new C4683e(R.attr.drawableTint, i));
        } else {
            c4683e.vip = i;
        }
    }

    public static InterfaceC11282e metrica(Bundle bundle) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(AbstractC12534e.class.getClassLoader());
            Parcelable parcelable = bundle2.getParcelable("a");
            if (parcelable instanceof ParcelImpl) {
                return ((ParcelImpl) parcelable).f596e;
            }
            throw new IllegalArgumentException("Invalid parcel");
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static C17269e mopub(int i, InterfaceC8850e interfaceC8850e, InterfaceC18435e interfaceC18435e, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC8850e = C2693e.f6576e;
        }
        return adcel(interfaceC18435e, interfaceC8850e, new C4070e(false), function2);
    }

    public static final InterfaceC12864e purchase(InterfaceC12864e interfaceC12864e, boolean z, C15274e c15274e, C13822e c13822e, boolean z2, C11796e c11796e, Function1 function1) {
        InterfaceC12864e premium;
        if (AbstractC0869e.premium(c13822e)) {
            premium = new C4185e(z, c15274e, c13822e, z2, c11796e, function1);
        } else if (c13822e == null) {
            premium = new C4185e(z, c15274e, null, z2, c11796e, function1);
        } else {
            C0115e c0115e = C0115e.f1276e;
            premium = c15274e != null ? AbstractC10746e.ad(c0115e, c15274e, c13822e).premium(new C4185e(z, c15274e, null, z2, c11796e, function1)) : AbstractC5679e.metrica(c0115e, new C18503e(c13822e, z, z2, c11796e, function1, 1));
        }
        return interfaceC12864e.premium(premium);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r14v8, types: [eٜٗۧ] */
    /* JADX WARN: Type inference failed for: r1v2, types: [eُۛۥ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startapp(defpackage.InterfaceC1618e r14, defpackage.C12402e r15, defpackage.AbstractC10731e r16) {
        /*
            r0 = r16
            boolean r1 = r0 instanceof defpackage.C11276e
            if (r1 == 0) goto L15
            r1 = r0
            eُۛۥ r1 = (defpackage.C11276e) r1
            int r2 = r1.f22652e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f22652e = r2
            goto L1a
        L15:
            eُۛۥ r1 = new eُۛۥ
            r1.<init>(r0)
        L1a:
            java.lang.Object r0 = r1.f22653e
            int r2 = r1.f22652e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eٜٗۧ r14 = r1.f22650e
            eًؓؗ r2 = r1.f22651e
            defpackage.AbstractC2003e.purchase(r0)
            r0 = r14
            r14 = r2
            goto L39
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L35:
            defpackage.AbstractC2003e.purchase(r0)
            r0 = r15
        L39:
            boolean r2 = r0.yandex()
            if (r2 != 0) goto L99
            eَّۙ r2 = r14.appmetrica()
            eَّۙ r4 = r0.metrica()
            long r4 = r4.f24832e
            r2.getClass()
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L87
            r8 = r4
        L53:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 <= 0) goto L78
            long r10 = r0.mo805this(r2, r8)
            r12 = -1
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 == 0) goto L63
            long r8 = r8 - r10
            goto L53
        L63:
            java.io.EOFException r14 = new java.io.EOFException
            java.lang.String r0 = "Source exhausted before reading "
            java.lang.String r1 = " bytes. Only "
            java.lang.StringBuilder r0 = defpackage.AbstractC1786e.inmobi(r4, r0, r1)
            long r4 = r4 - r8
            java.lang.String r1 = " were read."
            java.lang.String r0 = defpackage.AbstractC5087e.m1750native(r4, r1, r0)
            r14.<init>(r0)
            throw r14
        L78:
            r1.f22651e = r14
            r1.f22650e = r0
            r1.f22652e = r3
            java.lang.Object r2 = defpackage.AbstractC15710e.billing(r14, r1)
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            if (r2 != r4) goto L39
            return r4
        L87:
            java.lang.String r14 = "byteCount ("
            java.lang.String r0 = ") < 0"
            java.lang.String r14 = defpackage.AbstractC1634e.mopub(r4, r14, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r0.<init>(r14)
            throw r0
        L99:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC12534e.startapp(eًؓؗ, eَّۙ, eُؑ۠):java.lang.Object");
    }

    public static List vip(List list) {
        return list == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list);
    }

    public static final Object yandex(InterfaceC1618e interfaceC1618e, byte[] bArr, int i, int i2, AbstractC10731e abstractC10731e) {
        interfaceC1618e.appmetrica().write(bArr, i, i2);
        Object billing = AbstractC15710e.billing(interfaceC1618e, abstractC10731e);
        return billing == EnumC2821e.f6782e ? billing : Unit.INSTANCE;
    }
}
