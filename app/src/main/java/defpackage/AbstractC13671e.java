package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۨۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13671e {
    public static final ExecutorC14279e ad = new ExecutorC14279e(2);

    public static Object ad(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C14162e appmetrica(android.content.res.Resources.Theme r56, android.content.res.Resources r57, android.content.res.XmlResourceParser r58, int r59) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13671e.appmetrica(android.content.res.Resources$Theme, android.content.res.Resources, android.content.res.XmlResourceParser, int):eٓۖ");
    }

    public static void license(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object metrica(defpackage.InterfaceC9543e r4, kotlin.jvm.functions.Function0 r5, defpackage.AbstractC10731e r6) {
        /*
            boolean r0 = r6 instanceof defpackage.C6394e
            if (r0 == 0) goto L13
            r0 = r6
            eؙٓۥ r0 = (defpackage.C6394e) r0
            int r1 = r0.f13252e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13252e = r1
            goto L18
        L13:
            eؙٓۥ r0 = new eؙٓۥ
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f13250e
            int r1 = r0.f13252e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            kotlin.jvm.functions.Function0 r5 = r0.f13251e
            defpackage.AbstractC2003e.purchase(r6)     // Catch: java.lang.Throwable -> L27
            goto L62
        L27:
            r4 = move-exception
            goto L68
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.AbstractC2003e.purchase(r6)
            eٌِٞ r6 = r0.f21135e
            eْؖۧ r1 = defpackage.C4524e.f9798e
            eؗؒۚ r6 = r6.mo397public(r1)
            if (r6 != r4) goto L6c
            r0.f13251e = r5     // Catch: java.lang.Throwable -> L27
            r0.f13252e = r2     // Catch: java.lang.Throwable -> L27
            eْۢ٘ r6 = new eْۢ٘     // Catch: java.lang.Throwable -> L27
            eًؗۖ r0 = defpackage.AbstractC10558e.startapp(r0)     // Catch: java.lang.Throwable -> L27
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L27
            r6.tapsense()     // Catch: java.lang.Throwable -> L27
            eٖۗؔ r0 = new eٖۗؔ     // Catch: java.lang.Throwable -> L27
            r1 = 3
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L27
            eًٟؔ r4 = (defpackage.C2448e) r4     // Catch: java.lang.Throwable -> L27
            r4.m853e(r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r6.signatures()     // Catch: java.lang.Throwable -> L27
            eٟؔۙ r6 = defpackage.EnumC2821e.f6782e
            if (r4 != r6) goto L62
            return r6
        L62:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L68:
            r5.invoke()
            throw r4
        L6c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13671e.metrica(eٍٙٚ, kotlin.jvm.functions.Function0, eُؑ۠):java.lang.Object");
    }

    public static C0560e purchase(C0560e c0560e, C0560e c0560e2) {
        C15816e c15816e = new C15816e(5);
        C8988e c8988e = new C8988e((C0731e) c15816e.f31190e);
        C9509e c9509e = new C9509e(0, c8988e, new AtomicBoolean(false), c15816e);
        ExecutorC14279e executorC14279e = ad;
        c0560e.yandex(executorC14279e, c9509e);
        c0560e2.yandex(executorC14279e, c9509e);
        return c8988e.ad;
    }

    public static void vip(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
