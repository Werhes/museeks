package defpackage;

import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16966e {
    public final Object[] ad;
    public int vip;

    public C16966e() {
        this.ad = new Object[PSKKeyManager.MAX_KEY_LENGTH_BYTES];
    }

    public C16966e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.ad = new Object[i];
    }

    public Object ad() {
        int i = this.vip;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.ad;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.vip = i - 1;
        return obj;
    }

    public boolean metrica(Object obj) {
        Object[] objArr;
        boolean z;
        int i = this.vip;
        int i2 = 0;
        while (true) {
            objArr = this.ad;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.vip;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.vip = i3 + 1;
        return true;
    }

    public boolean vip(C0294e c0294e) {
        int i = this.vip;
        Object[] objArr = this.ad;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = c0294e;
        this.vip = i + 1;
        return true;
    }
}
