package defpackage;

import androidx.car.app.model.Alert;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: eؚٜۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7306e implements InterfaceC2868e, InterfaceC7898e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f14926e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f14927e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f14928e;

    public C7306e() {
        this.f14927e = new Object[8];
        this.f14928e = 0;
    }

    public C7306e(int i) {
        this.f14928e = i;
    }

    public C7306e(C2532e c2532e, int i) {
        this.f14926e = new Object();
        this.f14927e = c2532e;
        C5107e.smaato();
        this.f14928e = i;
    }

    public void ad(String str, C1032e c1032e) {
        int i = this.f14928e + 1;
        Object[] objArr = (Object[]) this.f14927e;
        int length = objArr.length;
        int i2 = i + i;
        if (i2 > length) {
            if (i2 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Alert.DURATION_SHOW_INDEFINITELY;
            }
            this.f14927e = Arrays.copyOf(objArr, i3);
        }
        Object[] objArr2 = (Object[]) this.f14927e;
        int i4 = this.f14928e;
        int i5 = i4 + i4;
        objArr2[i5] = str;
        objArr2[i5 + 1] = c1032e;
        this.f14928e = i4 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x010e A[LOOP:0: B:58:0x010c->B:59:0x010e, LOOP_END] */
    @Override // defpackage.InterfaceC2868e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.InterfaceC6396e appmetrica(defpackage.InterfaceC6396e r14) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7306e.appmetrica(eؙٓۧ):eؙٓۧ");
    }

    @Override // defpackage.InterfaceC7898e
    public void license(Object obj) {
        C0140e c0140e = (C0140e) this.f14927e;
        C4469e c4469e = (C4469e) this.f14926e;
        int i = this.f14928e;
        if (((Boolean) obj).booleanValue()) {
            C17488e amazon = C4469e.amazon(c4469e);
            String str = c0140e.license;
            amazon.ad();
            ((C4469e) amazon.f20053e).admob(str);
            amazon.ad();
            ((C4469e) amazon.f20053e).subscription(str);
            Long l = c0140e.appmetrica;
            if (l != null) {
                int longValue = (int) l.longValue();
                amazon.ad();
                ((C4469e) amazon.f20053e).remoteconfig(longValue);
            }
            C4469e c4469e2 = (C4469e) amazon.metrica();
            int i2 = c0140e.startapp;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            int i4 = i - 1;
            EnumC6651e enumC6651e = EnumC6651e.f13721e;
            C7101e c7101e = i3 != 0 ? i3 != 1 ? new C7101e(Integer.valueOf(i4), c4469e2, enumC6651e, null) : new C7101e(Integer.valueOf(i4), c4469e2, EnumC6651e.f13723e, null) : new C7101e(Integer.valueOf(i4), c4469e2, enumC6651e, null);
            C0140e.adcel.vip("analytics event: %s", c7101e);
            C11547e c11547e = c0140e.billing;
            if (c11547e != null) {
                c11547e.ad(c7101e, new C11180e(24));
            }
        }
    }

    public byte[] vip(int i) {
        C14047e c14047e;
        InterfaceC1848e interfaceC1848e;
        C10990e c10990e = C10990e.f21768e;
        C2532e c2532e = (C2532e) this.f14927e;
        ((C14995e) this.f14926e).startapp = Boolean.valueOf(1 == (i ^ 1));
        C14995e c14995e = (C14995e) this.f14926e;
        c14995e.billing = Boolean.FALSE;
        c2532e.f6388e = new C5970e(c14995e);
        try {
            C5107e.smaato();
            if (i == 0) {
                C9393e c9393e = new C9393e(c2532e);
                C10610e c10610e = new C10610e();
                c10990e.yandex(c10610e);
                c10610e.f20918e = true;
                StringWriter stringWriter = new StringWriter();
                try {
                    C6722e c6722e = new C6722e(stringWriter, c10610e.f20919e, c10610e.f20917e, c10610e.f20916e, c10610e.f20918e);
                    c6722e.yandex(c9393e);
                    c6722e.adcel();
                    c6722e.vip.flush();
                } catch (IOException unused) {
                }
                return stringWriter.toString().getBytes("utf-8");
            }
            C9393e c9393e2 = new C9393e(c2532e);
            C0909e c0909e = new C0909e(2);
            c10990e.yandex(c0909e);
            HashMap hashMap = new HashMap((HashMap) c0909e.f3323e);
            HashMap hashMap2 = new HashMap((HashMap) c0909e.f3322e);
            C11373e c11373e = (C11373e) c0909e.f3321e;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c14047e = new C14047e(byteArrayOutputStream, hashMap, hashMap2, c11373e);
                interfaceC1848e = (InterfaceC1848e) hashMap.get(C9393e.class);
            } catch (IOException unused2) {
            }
            if (interfaceC1848e == null) {
                throw new RuntimeException("No encoder for ".concat(String.valueOf(C9393e.class)));
            }
            interfaceC1848e.ad(c9393e2, c14047e);
            return byteArrayOutputStream.toByteArray();
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
