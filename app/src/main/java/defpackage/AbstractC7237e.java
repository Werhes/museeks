package defpackage;

import android.content.Context;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚ٘ۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7237e implements InterfaceC13794e {
    public static final C2892e ad = new C2892e(1065684890, false, new C7478e(21));
    public static final C2892e vip = new C2892e(1735521689, false, new C7478e(22));
    public static final C2892e metrica = new C2892e(1198433816, false, new C10387e(12));

    public static final void ad(View view, AbstractC10716e abstractC10716e) {
        C1059e c1059e;
        Context context = view.getContext();
        AbstractActivityC17704e abstractActivityC17704e = context instanceof AbstractActivityC17704e ? (AbstractActivityC17704e) context : null;
        if (abstractActivityC17704e != null && (c1059e = abstractActivityC17704e.f34700e) != null) {
            c1059e.m461getCurrentFragment();
        }
        metrica(view.getContext(), abstractC10716e);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void license(defpackage.InterfaceC14576e r10, defpackage.C12476e r11) {
        /*
            eّۦٌ r0 = r11.vip
            boolean r1 = r11.license()
            eؑۤۚ r2 = r11.ad
            if (r1 == 0) goto L13
            int r1 = r2.purchase
            r3 = 3
            if (r1 != r3) goto L10
            goto L13
        L10:
            r1 = 1
        L11:
            r7 = r1
            goto L15
        L13:
            r1 = 0
            goto L11
        L15:
            if (r7 == 0) goto L40
            long r3 = r11.metrica
            r11 = 32
            long r5 = r3 >> r11
            int r1 = (int) r5
            float r1 = (float) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r8 = (long) r1
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r1
            long r8 = r8 << r11
            long r3 = r3 & r5
            long r3 = r3 | r8
            r5 = 0
            eؒؐۥ r11 = defpackage.AbstractC18489e.billing(r5, r3)
            r10.billing()
            r10.remoteconfig(r11)
        L40:
            eٕؓۧ r11 = r2.vip
            eٟؖۧ r11 = r11.ad
            eِۙۛ r1 = r11.smaato
            eٖۜۙ r2 = r11.ad
            if (r1 != 0) goto L4c
            eِۙۛ r1 = defpackage.C11964e.vip
        L4c:
            r5 = r1
            eٓٓۢ r1 = r11.amazon
            if (r1 != 0) goto L53
            eٓٓۢ r1 = defpackage.C13973e.license
        L53:
            r4 = r1
            eؗٙٚ r11 = r11.Signature
            if (r11 != 0) goto L5a
            eؙْۗ r11 = defpackage.C6590e.ad
        L5a:
            r6 = r11
            r11 = r2
            eۣؖؒ r2 = r11.appmetrica()     // Catch: java.lang.Throwable -> L95
            eًؒؑ r1 = defpackage.C0925e.ad
            if (r2 == 0) goto L7e
            if (r11 == r1) goto L71
            float r11 = r11.ad()     // Catch: java.lang.Throwable -> L6d
        L6a:
            r1 = r10
            r3 = r11
            goto L74
        L6d:
            r0 = move-exception
            r11 = r0
            r1 = r10
            goto L98
        L71:
            r11 = 1065353216(0x3f800000, float:1.0)
            goto L6a
        L74:
            r0.adcel(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7a
            r10 = r1
            r1 = r10
            goto L8d
        L7a:
            r0 = move-exception
            r10 = r1
        L7c:
            r11 = r0
            goto L98
        L7e:
            if (r11 == r1) goto L87
            long r1 = r11.vip()     // Catch: java.lang.Throwable -> L6d
        L84:
            r2 = r1
            r1 = r10
            goto L8a
        L87:
            long r1 = defpackage.C3618e.vip     // Catch: java.lang.Throwable -> L95
            goto L84
        L8a:
            r0.startapp(r1, r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L93
        L8d:
            if (r7 == 0) goto L92
            r1.admob()
        L92:
            return
        L93:
            r0 = move-exception
            goto L7c
        L95:
            r0 = move-exception
            r1 = r10
            goto L7c
        L98:
            if (r7 == 0) goto L9d
            r1.admob()
        L9d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC7237e.license(eؚٜٔ, eِّٔ):void");
    }

    public static final void metrica(Context context, AbstractC10716e abstractC10716e) {
        if (!(context instanceof AbstractActivityC8792e)) {
            throw new IllegalStateException("The required Context is not attached to NavigationActivity!");
        }
        ((AbstractActivityC8792e) context).isVip(abstractC10716e);
    }

    public static final C13458e vip(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        C2511e c2511e = new C2511e(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) AbstractC1660e.crashlytics(i2, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            c2511e.advert(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) AbstractC1660e.crashlytics(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    int i4 = c2511e.license;
                    List[] listArr = c2511e.purchase;
                    List list = listArr[i4];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[c2511e.license] = list;
                    }
                    list.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        C13458e c13458e = new C13458e(str, enumArr);
        c13458e.metrica = c2511e;
        return c13458e;
    }
}
