package defpackage;

import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٖۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8913e {
    public static ClassLoader ad;
    public static Thread vip;
    public static final C2892e metrica = new C2892e(225200472, false, new C5029e(12));
    public static final C2892e license = new C2892e(1124137464, false, new C5029e(13));
    public static final C2892e appmetrica = new C2892e(257842041, false, new C9868e(1));
    public static final C2892e purchase = new C2892e(-360052666, false, new C5029e(14));
    public static final char[] billing = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static /* synthetic */ void ad(int i) {
        String str = i != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 18 ? 3 : 2];
        switch (i) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                objArr[0] = "name";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                objArr[2] = "resolveOverrides";
                break;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                break;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        String format = String.format(str, objArr);
        if (i == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static LinkedHashSet adcel(C0520e c0520e, Collection collection, AbstractCollection abstractCollection, C10184e c10184e, InterfaceC13521e interfaceC13521e, C14514e c14514e) {
        if (c0520e == null) {
            ad(6);
            throw null;
        }
        if (collection == null) {
            ad(7);
            throw null;
        }
        if (c10184e == null) {
            ad(9);
            throw null;
        }
        if (interfaceC13521e == null) {
            ad(10);
            throw null;
        }
        if (c14514e != null) {
            return yandex(c0520e, collection, abstractCollection, c10184e, interfaceC13521e, c14514e, true);
        }
        ad(11);
        throw null;
    }

    public static C13043e appmetrica(C0520e c0520e, InterfaceC5052e interfaceC5052e) {
        if (c0520e == null) {
            ad(19);
            throw null;
        }
        if (interfaceC5052e == null) {
            ad(20);
            throw null;
        }
        Collection mo1732throw = interfaceC5052e.mo1732throw();
        if (mo1732throw.size() != 1) {
            return null;
        }
        for (C13043e c13043e : ((C7283e) mo1732throw.iterator().next()).mo330e()) {
            if (c13043e.getName().equals(c0520e)) {
                return c13043e;
            }
        }
        return null;
    }

    public static final boolean billing(C13915e c13915e) {
        int m2467class = AbstractC8703e.m2467class(c13915e.f27612e.license);
        if (m2467class == 0) {
            return false;
        }
        if (m2467class != 1) {
            if (m2467class == 2) {
                return false;
            }
            if (m2467class != 3) {
                if (m2467class != 4) {
                    throw new C14803e(10);
                }
                C13915e tapsense = c13915e.tapsense();
                if (tapsense != null) {
                    return billing(tapsense);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return true;
    }

    public static int license(InputStream inputStream) {
        if (inputStream instanceof AbstractC9907e) {
            return ((AbstractC9907e) inputStream).f19544e;
        }
        if (inputStream instanceof Cgoto) {
            return ((Cgoto) inputStream).f36399e;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < 2147483647L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long maxMemory = Runtime.getRuntime().maxMemory();
        return maxMemory > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : (int) maxMemory;
    }

    public static final void metrica(long j, long j2, long j3) {
        if (j2 < 0 || j2 > j || j - j2 < j3 || j3 < 0) {
            StringBuilder inmobi = AbstractC1786e.inmobi(j2, "offset (", ") and byteCount (");
            inmobi.append(j3);
            inmobi.append(") are not within the range [0..size(");
            inmobi.append(j);
            inmobi.append("))");
            throw new IllegalArgumentException(inmobi.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b0, code lost:
    
        if (r2 == null) goto L61;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader mopub() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8913e.mopub():java.lang.ClassLoader");
    }

    public static final ArrayList purchase(InterfaceC0732e interfaceC0732e) {
        C13915e mo1461continue = ((AbstractC9292e) interfaceC0732e).mo1461continue();
        boolean billing2 = billing(mo1461continue);
        C8794e c8794e = (C8794e) mo1461continue.Signature();
        C12431e c12431e = (C12431e) c8794e.f17708e;
        ArrayList arrayList = new ArrayList(c12431e.f24868e);
        int i = c12431e.f24868e;
        for (int i2 = 0; i2 < i; i2++) {
            C13915e c13915e = (C13915e) c8794e.get(i2);
            arrayList.add(billing2 ? c13915e.smaato() : c13915e.amazon());
        }
        return arrayList;
    }

    public static LinkedHashSet startapp(C0520e c0520e, AbstractCollection abstractCollection, Collection collection, InterfaceC5052e interfaceC5052e, InterfaceC13521e interfaceC13521e, C14514e c14514e) {
        if (c0520e == null) {
            ad(0);
            throw null;
        }
        if (interfaceC5052e == null) {
            ad(3);
            throw null;
        }
        if (interfaceC13521e == null) {
            ad(4);
            throw null;
        }
        if (c14514e != null) {
            return yandex(c0520e, abstractCollection, collection, interfaceC5052e, interfaceC13521e, c14514e, false);
        }
        ad(5);
        throw null;
    }

    public static final void vip(long j, long j2, long j3) {
        if (j2 >= 0 && j3 <= j) {
            if (j2 > j3) {
                throw new IllegalArgumentException(AbstractC10257e.mopub(AbstractC1786e.inmobi(j2, "startIndex (", ") > endIndex ("), j3, ')'));
            }
            return;
        }
        StringBuilder inmobi = AbstractC1786e.inmobi(j2, "startIndex (", ") and endIndex (");
        inmobi.append(j3);
        inmobi.append(") are not within the range [0..size(");
        inmobi.append(j);
        inmobi.append("))");
        throw new IndexOutOfBoundsException(inmobi.toString());
    }

    public static LinkedHashSet yandex(C0520e c0520e, Collection collection, Collection collection2, InterfaceC5052e interfaceC5052e, InterfaceC13521e interfaceC13521e, C14514e c14514e, boolean z) {
        if (c0520e == null) {
            ad(12);
            throw null;
        }
        if (collection == null) {
            ad(13);
            throw null;
        }
        if (interfaceC5052e == null) {
            ad(15);
            throw null;
        }
        if (interfaceC13521e == null) {
            ad(16);
            throw null;
        }
        if (c14514e == null) {
            ad(17);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        c14514e.yandex(c0520e, collection, collection2, interfaceC5052e, new C7571e(interfaceC13521e, linkedHashSet, z));
        return linkedHashSet;
    }
}
