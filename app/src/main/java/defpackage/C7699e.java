package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7699e implements InterfaceC8500e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f15623e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f15624e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public long f15625e;

    public C7699e() {
        this.f15624e = new C1756e();
        this.f15623e = new C1756e();
    }

    public C7699e(long j, C13572e c13572e) {
        this.f15625e = j;
        this.f15624e = c13572e;
        this.f15623e = new C18524e(this, j);
    }

    public C7699e(C1248e c1248e, String str) {
        this.f15623e = c1248e;
        AbstractC9528e.purchase(str);
        this.f15624e = str;
        this.f15625e = -1L;
    }

    public C7699e(C1248e c1248e, String str, long j) {
        this.f15623e = c1248e;
        AbstractC9528e.purchase(str);
        this.f15624e = str;
        this.f15625e = c1248e.m511e("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)}, -1L);
    }

    public C7699e(InterfaceC8500e interfaceC8500e, C18543e c18543e, long j) {
        this.f15624e = interfaceC8500e;
        this.f15623e = c18543e;
        this.f15625e = j;
    }

    @Override // defpackage.InterfaceC8500e
    public C18543e ad() {
        return (C18543e) this.f15623e;
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC11039e appmetrica() {
        InterfaceC8500e interfaceC8500e = (InterfaceC8500e) this.f15624e;
        return interfaceC8500e != null ? interfaceC8500e.appmetrica() : EnumC11039e.f21870e;
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC14802e billing() {
        InterfaceC8500e interfaceC8500e = (InterfaceC8500e) this.f15624e;
        return interfaceC8500e != null ? interfaceC8500e.billing() : EnumC14802e.f29328e;
    }

    public void license(long j, long j2) {
        ((C1756e) this.f15624e).ad(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C1756e) this.f15623e).ad(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    @Override // defpackage.InterfaceC8500e
    public long metrica() {
        InterfaceC8500e interfaceC8500e = (InterfaceC8500e) this.f15624e;
        if (interfaceC8500e != null) {
            return interfaceC8500e.metrica();
        }
        long j = this.f15625e;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // defpackage.InterfaceC8500e
    public EnumC13761e purchase() {
        InterfaceC8500e interfaceC8500e = (InterfaceC8500e) this.f15624e;
        return interfaceC8500e != null ? interfaceC8500e.purchase() : EnumC13761e.f27265e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ea A[DONT_GENERATE] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List startapp() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7699e.startapp():java.util.List");
    }

    @Override // defpackage.InterfaceC8500e
    public int vip() {
        InterfaceC8500e interfaceC8500e = (InterfaceC8500e) this.f15624e;
        if (interfaceC8500e != null) {
            return interfaceC8500e.vip();
        }
        return 1;
    }

    public void yandex(C15695e c15695e, InterfaceC4082e interfaceC4082e, Map map, long j) {
        C18524e c18524e = (C18524e) this.f15623e;
        long j2 = c18524e.f36318e;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c18524e.f36317e;
        if (j > j2) {
            Object remove = linkedHashMap.remove(c15695e);
            if (remove != null) {
                c18524e.f36319e = c18524e.license() - c18524e.purchase(c15695e, remove);
                c18524e.metrica(c15695e, remove, null);
            }
            ((C13572e) this.f15624e).inmobi(c15695e, interfaceC4082e, map, j);
            return;
        }
        C8732e c8732e = new C8732e(interfaceC4082e, map, j);
        Object put = linkedHashMap.put(c15695e, c8732e);
        c18524e.f36319e = c18524e.purchase(c15695e, c8732e) + c18524e.license();
        if (put != null) {
            c18524e.f36319e = c18524e.license() - c18524e.purchase(c15695e, put);
            c18524e.metrica(c15695e, put, c8732e);
        }
        c18524e.billing(c18524e.f36318e);
    }
}
