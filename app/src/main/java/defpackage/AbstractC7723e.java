package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؕۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7723e implements InterfaceC11801e {
    public static String ad(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static AbstractC7723e vip(String str) {
        int length = str.length();
        return length != 0 ? length != 1 ? length != 2 ? new C12113e(str) : new C12925e(str.charAt(0), str.charAt(1)) : new C18142e(str.charAt(0), 0) : C8382e.f17147e;
    }

    public AbstractC7723e license() {
        return new C12113e(this);
    }

    public abstract boolean metrica(char c);
}
