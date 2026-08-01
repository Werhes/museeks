package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;

/* renamed from: eؘْۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5620e extends ObjectInputStream {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final HashSet f11976e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f11977e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Class f11978e;

    static {
        HashSet hashSet = new HashSet();
        f11976e = hashSet;
        hashSet.add("java.util.TreeMap");
        hashSet.add("java.lang.Integer");
        hashSet.add("java.lang.Number");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDS");
        hashSet.add("java.util.ArrayList");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
        hashSet.add("[B");
        hashSet.add("java.util.LinkedList");
        hashSet.add("java.util.Stack");
        hashSet.add("java.util.Vector");
        hashSet.add("[Ljava.lang.Object;");
        hashSet.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
    }

    public C5620e(Class cls, ByteArrayInputStream byteArrayInputStream) {
        super(byteArrayInputStream);
        this.f11977e = false;
        this.f11978e = cls;
    }

    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        if (this.f11977e) {
            if (!f11976e.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
        } else {
            if (!objectStreamClass.getName().equals(this.f11978e.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            this.f11977e = true;
        }
        return super.resolveClass(objectStreamClass);
    }
}
