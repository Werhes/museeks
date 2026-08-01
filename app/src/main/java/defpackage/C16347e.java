package defpackage;

import android.util.Log;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16347e implements AutoCloseable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f32119e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f32120e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32121e = 1;

    public C16347e(AbstractC10732e abstractC10732e) {
        this.f32120e = abstractC10732e;
        this.f32119e = abstractC10732e.ad();
    }

    public C16347e(Object obj, String str, ArrayDeque arrayDeque) {
        this.f32119e = arrayDeque;
        if (obj != null) {
            arrayDeque.addFirst(new C6298e(obj, str));
            if (Log.isLoggable("CarApp.Bun", 2)) {
                StringBuilder sb = new StringBuilder();
                int min = Math.min(arrayDeque.size(), 11);
                if (((String[]) this.f32120e) == null) {
                    this.f32120e = new String[12];
                }
                String str2 = ((String[]) this.f32120e)[min];
                if (str2 == null) {
                    char[] cArr = new char[min];
                    Arrays.fill(cArr, ' ');
                    String str3 = new String(cArr);
                    str2 = min == 11 ? str3.concat("...") : str3;
                    ((String[]) this.f32120e)[min] = str2;
                }
                sb.append(str2);
                sb.append(AbstractC1080e.startapp(obj.getClass()) + " " + str);
                Log.v("CarApp.Bun", sb.toString());
            }
        }
    }

    public Object ad() {
        Object obj = this.f32119e;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Already closed");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.f32121e) {
            case 0:
                ((ArrayDeque) this.f32119e).removeFirst();
                return;
            default:
                AbstractC10732e abstractC10732e = (AbstractC10732e) this.f32120e;
                Object obj = this.f32119e;
                if (obj == null) {
                    return;
                }
                abstractC10732e.vip(obj);
                this.f32119e = null;
                return;
        }
    }

    public String license() {
        StringBuilder sb = new StringBuilder();
        ArrayDeque arrayDeque = (ArrayDeque) this.f32119e;
        int min = Math.min(arrayDeque.size(), 8);
        Iterator descendingIterator = arrayDeque.descendingIterator();
        while (descendingIterator.hasNext()) {
            int i = min - 1;
            if (min <= 0) {
                break;
            }
            sb.append(((C6298e) descendingIterator.next()).ad());
            min = i;
        }
        if (descendingIterator.hasNext()) {
            sb.append("[...]");
        }
        return sb.toString();
    }
}
