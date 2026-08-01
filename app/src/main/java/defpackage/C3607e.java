package defpackage;

import java.io.Serializable;
import java.util.TreeMap;

/* renamed from: eؕۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3607e implements Serializable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final transient long f8136e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final TreeMap f8137e;

    public C3607e(long j) {
        this.f8137e = new TreeMap();
        this.f8136e = j;
    }

    public C3607e(C3607e c3607e, long j) {
        this.f8137e = new TreeMap();
        for (Integer num : c3607e.f8137e.keySet()) {
            this.f8137e.put(num, new C9648e((C9648e) c3607e.f8137e.get(num)));
        }
        this.f8136e = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ca, code lost:
    
        if ((r25 % ((long) java.lang.Math.pow(r7, r6 + 1))) != 0) goto L26;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕۚؓ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3607e(defpackage.C13719e r28, long r29, byte[] r31, byte[] r32) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3607e.<init>(eٟٓؒ, long, byte[], byte[]):void");
    }

    public final C3607e ad(Ctry ctry) {
        C3607e c3607e = new C3607e(this.f8136e);
        TreeMap treeMap = this.f8137e;
        for (Integer num : treeMap.keySet()) {
            C9648e c9648e = (C9648e) treeMap.get(num);
            c9648e.getClass();
            c3607e.f8137e.put(num, new C9648e(c9648e, ctry));
        }
        return c3607e;
    }
}
