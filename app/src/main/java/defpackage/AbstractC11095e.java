package defpackage;

import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.Pair;
import ealvatag.tag.datatype.PairedTextEncodedStringNullTerminated;
import ealvatag.tag.id3.framebody.AbstractFrameBodyNumberTotal;
import ealvatag.tag.id3.framebody.AbstractFrameBodyPairs;
import ealvatag.tag.id3.framebody.AbstractFrameBodyTextInfo;
import ealvatag.tag.id3.framebody.FrameBodyAPIC;
import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyEncrypted;
import ealvatag.tag.id3.framebody.FrameBodyIPLS;
import ealvatag.tag.id3.framebody.FrameBodyPIC;
import ealvatag.tag.id3.framebody.FrameBodyPOPM;
import ealvatag.tag.id3.framebody.FrameBodyTIPL;
import ealvatag.tag.id3.framebody.FrameBodyTMCL;
import ealvatag.tag.id3.framebody.FrameBodyTXXX;
import ealvatag.tag.id3.framebody.FrameBodyUFID;
import ealvatag.tag.id3.framebody.FrameBodyUSLT;
import ealvatag.tag.id3.framebody.FrameBodyUnsupported;
import ealvatag.tag.id3.framebody.FrameBodyWOAR;
import ealvatag.tag.id3.framebody.FrameBodyWXXX;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٚۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11095e extends AbstractC16225e implements InterfaceC1425e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final byte[] f21993e = {73, 68, 51};

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C7936e f21994e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public LinkedHashMap f21995e = null;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public LinkedHashMap f21999e = null;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public String f21998e = BuildConfig.FLAVOR;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public Long f21996e = null;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public Long f21997e = null;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        f21994e = new C7936e(2);
    }

    public static FileLock crashlytics(FileChannel fileChannel, String str) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f21994e.getClass();
        int i = C1724e.ad;
        try {
            FileLock tryLock = fileChannel.tryLock();
            if (tryLock != null) {
                return tryLock;
            }
            Locale.getDefault();
            throw new IOException(AbstractC5087e.m1746extends("Cannot make changes to file ", str, " because it is being used by another application"));
        } catch (IOException | Error unused) {
            return null;
        }
    }

    public static int signatures(int i, int i2) {
        return i <= i2 ? i2 : i + 100;
    }

    /* renamed from: this, reason: not valid java name */
    public static boolean m2989this(RandomAccessFile randomAccessFile) {
        long filePointer = randomAccessFile.getFilePointer();
        byte[] bArr = new byte[3];
        randomAccessFile.read(bArr);
        randomAccessFile.seek(filePointer);
        if (!Arrays.equals(bArr, f21993e)) {
            return false;
        }
        randomAccessFile.seek(randomAccessFile.getFilePointer() + 6);
        randomAccessFile.read(new byte[4]);
        randomAccessFile.seek(AbstractC8294e.vip(ByteBuffer.wrap(r0)) + 10);
        return true;
    }

    /* renamed from: try, reason: not valid java name */
    public static void m2990try(File file, File file2) {
        File file3 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC16425e.appmetrica(file.getPath()) + ".old");
        int i = 1;
        while (file3.exists()) {
            file3 = new File(file.getAbsoluteFile().getParentFile().getPath(), AbstractC16425e.appmetrica(file.getPath()) + ".old" + i);
            i++;
        }
        boolean renameTo = file.renameTo(file3);
        C7936e c7936e = f21994e;
        if (!renameTo) {
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            file2.delete();
            throw new C4744e("Cannot make changes to file %s because unable to rename the original file to %s", file, file3);
        }
        if (file2.renameTo(file)) {
            if (file3.delete()) {
                return;
            }
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            return;
        }
        if (!file2.exists()) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
        }
        if (!file3.renameTo(file)) {
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i5 = C1724e.ad;
        }
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i6 = C1724e.ad;
        file2.delete();
        throw new C4744e("Cannot make changes to file %s because unable to rename from temporary file %s", file, file2);
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m2991abstract(int i, ByteArrayOutputStream byteArrayOutputStream) {
        mo2920default(Channels.newChannel(byteArrayOutputStream), i);
    }

    public InterfaceC3589e ad(EnumC8271e enumC8271e, String... strArr) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        String str = (String) AbstractC5542e.purchase(strArr, "values");
        C12894e mo2919class = mo2919class(enumC8271e);
        String str2 = (String) mo2919class.f25750e;
        if (AbstractC18544e.ad.contains(enumC8271e)) {
            AbstractC1550e tapsense = tapsense(str2);
            ((AbstractFrameBodyNumberTotal) tapsense.f28795e).setNumber(str);
            return tapsense;
        }
        if (AbstractC18544e.vip.contains(enumC8271e)) {
            AbstractC1550e tapsense2 = tapsense(str2);
            ((AbstractFrameBodyNumberTotal) tapsense2.f28795e).setTotal(str);
            return tapsense2;
        }
        String str3 = strArr[0];
        String str4 = (String) mo2919class.f25752e;
        AbstractC1550e tapsense3 = tapsense(str2);
        AbstractC12444e abstractC12444e = tapsense3.f28795e;
        if (abstractC12444e instanceof FrameBodyUFID) {
            ((FrameBodyUFID) abstractC12444e).setOwner(str4);
            try {
                ((FrameBodyUFID) tapsense3.f28795e).setUniqueIdentifier(str3.getBytes("ISO-8859-1"));
                return tapsense3;
            } catch (UnsupportedEncodingException unused) {
                throw new RuntimeException("When encoding UFID charset ISO-8859-1 was deemed unsupported");
            }
        }
        if (abstractC12444e instanceof FrameBodyTXXX) {
            ((FrameBodyTXXX) abstractC12444e).setDescription(str4);
            ((FrameBodyTXXX) tapsense3.f28795e).setText(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyWXXX) {
            ((FrameBodyWXXX) abstractC12444e).setDescription(str4);
            ((FrameBodyWXXX) tapsense3.f28795e).setUrlLink(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyCOMM) {
            if (str4 != null) {
                ((FrameBodyCOMM) abstractC12444e).setDescription(str4);
                if (((FrameBodyCOMM) tapsense3.f28795e).isMediaMonkeyFrame()) {
                    ((FrameBodyCOMM) tapsense3.f28795e).setLanguage("XXX");
                }
            }
            ((FrameBodyCOMM) tapsense3.f28795e).setText(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyUSLT) {
            ((FrameBodyUSLT) abstractC12444e).setDescription(BuildConfig.FLAVOR);
            ((FrameBodyUSLT) tapsense3.f28795e).setLyric(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyWOAR) {
            ((FrameBodyWOAR) abstractC12444e).setUrlLink(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof AbstractFrameBodyTextInfo) {
            ((AbstractFrameBodyTextInfo) abstractC12444e).setText(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyPOPM) {
            ((FrameBodyPOPM) abstractC12444e).parseString(str3);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyIPLS) {
            if (str4 != null) {
                ((FrameBodyIPLS) abstractC12444e).addPair(str4, str3);
                return tapsense3;
            }
            if (strArr.length >= 2) {
                ((FrameBodyIPLS) abstractC12444e).addPair(strArr[0], strArr[1]);
                return tapsense3;
            }
            ((FrameBodyIPLS) abstractC12444e).addPair(strArr[0]);
            return tapsense3;
        }
        if (abstractC12444e instanceof FrameBodyTIPL) {
            ((FrameBodyTIPL) abstractC12444e).addPair(str4, str3);
            return tapsense3;
        }
        if (!(abstractC12444e instanceof FrameBodyTMCL)) {
            if ((abstractC12444e instanceof FrameBodyAPIC) || (abstractC12444e instanceof FrameBodyPIC)) {
                throw new C14803e("Cover Art cannot be created using this method", 17, (byte) 0);
            }
            throw new Exception(AbstractC17861e.admob("Field with key of:", str2, ":does not accept cannot parse data:", str3));
        }
        if (strArr.length >= 2) {
            ((FrameBodyTMCL) abstractC12444e).addPair(strArr[0], strArr[1]);
            return tapsense3;
        }
        ((FrameBodyTMCL) abstractC12444e).addPair(strArr[0]);
        return tapsense3;
    }

    @Override // defpackage.InterfaceC9354e
    public final Iterator adcel() {
        return new C14950e(this.f21995e.entrySet().iterator(), this.f21995e.entrySet().iterator());
    }

    public String ads(String str) {
        return str;
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC3589e advert(AbstractC13977e abstractC13977e) {
        AbstractC1550e tapsense = tapsense((String) mo2919class(EnumC8271e.COVER_ART).f25750e);
        AbstractC12444e abstractC12444e = tapsense.f28795e;
        abstractC13977e.getClass();
        abstractC12444e.setObjectValue(DataTypes.OBJ_PICTURE_DATA, abstractC13977e.ad);
        abstractC12444e.setObjectValue(DataTypes.OBJ_PICTURE_TYPE, Integer.valueOf(abstractC13977e.metrica));
        abstractC12444e.setObjectValue(premium(), ads(abstractC13977e.vip));
        abstractC12444e.setObjectValue(DataTypes.OBJ_DESCRIPTION, BuildConfig.FLAVOR);
        return tapsense;
    }

    public final void applovin(C12894e c12894e) {
        List list;
        String str = (String) c12894e.f25752e;
        String str2 = (String) c12894e.f25750e;
        if (str == null) {
            EnumC8271e enumC8271e = (EnumC8271e) c12894e.f25751e;
            if (enumC8271e == null || !(enumC8271e == EnumC8271e.PERFORMER || enumC8271e == EnumC8271e.INVOLVED_PERSON)) {
                if (str == null) {
                    m2997while(str2);
                    return;
                }
                return;
            }
            Iterator it = subs(str2).iterator();
            while (it.hasNext()) {
                AbstractC12444e abstractC12444e = ((AbstractC1550e) ((InterfaceC3589e) it.next())).f28795e;
                if (abstractC12444e instanceof AbstractFrameBodyPairs) {
                    PairedTextEncodedStringNullTerminated.ValuePairs pairing = ((AbstractFrameBodyPairs) abstractC12444e).getPairing();
                    ListIterator<Pair> listIterator = pairing.getMapping().listIterator();
                    while (listIterator.hasNext()) {
                        if (((EnumC3587e) EnumC3587e.f8109e.get(listIterator.next().getKey())) == null) {
                            listIterator.remove();
                        }
                    }
                    if (pairing.getMapping().size() == 0) {
                        m2997while(str2);
                    }
                }
            }
            return;
        }
        Object obj = this.f21995e.get(str2);
        if (obj == null) {
            list = new ArrayList();
        } else if (obj instanceof List) {
            list = (List) obj;
        } else {
            if (!(obj instanceof AbstractC1550e)) {
                throw new RuntimeException(AbstractC1634e.advert(obj, "Found entry in frameMap that was not a frame or a list:"));
            }
            AbstractC17595e.metrica(1, "arraySize");
            ArrayList arrayList = new ArrayList(AbstractC10509e.loadAd(1 + 5 + 0));
            Collections.addAll(arrayList, (InterfaceC3589e) obj);
            list = arrayList;
        }
        ListIterator listIterator2 = list.listIterator();
        while (listIterator2.hasNext()) {
            AbstractC12444e abstractC12444e2 = ((AbstractC1550e) listIterator2.next()).f28795e;
            if (abstractC12444e2 instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC12444e2).getDescription().equals(str)) {
                    if (list.size() == 1) {
                        m2997while(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC12444e2 instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC12444e2).getDescription().equals(str)) {
                    if (list.size() == 1) {
                        m2997while(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC12444e2 instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC12444e2).getDescription().equals(str)) {
                    if (list.size() == 1) {
                        m2997while(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC12444e2 instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC12444e2).getOwner().equals(str)) {
                    if (list.size() == 1) {
                        m2997while(str2);
                    } else {
                        listIterator2.remove();
                    }
                }
            } else if (abstractC12444e2 instanceof FrameBodyTIPL) {
                PairedTextEncodedStringNullTerminated.ValuePairs pairing2 = ((FrameBodyTIPL) abstractC12444e2).getPairing();
                ListIterator<Pair> listIterator3 = pairing2.getMapping().listIterator();
                while (listIterator3.hasNext()) {
                    if (listIterator3.next().getKey().equals(str)) {
                        listIterator3.remove();
                    }
                }
                if (pairing2.getMapping().size() == 0) {
                    m2997while(str2);
                }
            } else {
                if (!(abstractC12444e2 instanceof FrameBodyIPLS)) {
                    throw new C14803e("Need to implement getFields(FieldKey genericKey) for:" + abstractC12444e2.getClass(), 17, (byte) 0);
                }
                PairedTextEncodedStringNullTerminated.ValuePairs pairing3 = ((FrameBodyIPLS) abstractC12444e2).getPairing();
                ListIterator<Pair> listIterator4 = pairing3.getMapping().listIterator();
                while (listIterator4.hasNext()) {
                    if (listIterator4.next().getKey().equals(str)) {
                        listIterator4.remove();
                    }
                }
                if (pairing3.getMapping().size() == 0) {
                    m2997while(str2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.AbstractC9621e appmetrica(defpackage.EnumC8271e r7) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11095e.appmetrica(eًّۡ):eٍٞؐ");
    }

    @Override // defpackage.InterfaceC9354e
    public final boolean billing(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        AbstractC17475e metrica = metrica(enumC8271e);
        return (metrica.size() > 0 ? AbstractC9621e.ad(metrica.get(0)) : C1444e.f4274e).metrica();
    }

    /* renamed from: break */
    public abstract long mo2918break(File file, long j);

    /* renamed from: case, reason: not valid java name */
    public final ByteArrayOutputStream m2992case() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m2993catch(this.f21995e, byteArrayOutputStream);
        m2993catch(this.f21999e, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    /* renamed from: catch, reason: not valid java name */
    public final void m2993catch(LinkedHashMap linkedHashMap, ByteArrayOutputStream byteArrayOutputStream) {
        TreeSet treeSet = new TreeSet(mo2922goto());
        treeSet.addAll(linkedHashMap.keySet());
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            Object obj = linkedHashMap.get((String) it.next());
            if (obj instanceof AbstractC1550e) {
                AbstractC1550e abstractC1550e = (AbstractC1550e) obj;
                abstractC1550e.f4427e = this.f31887e;
                abstractC1550e.write(byteArrayOutputStream);
            } else if (obj instanceof C0617e) {
                for (AbstractC1550e abstractC1550e2 : ((C0617e) obj).f2825e) {
                    abstractC1550e2.f4427e = this.f31887e;
                    abstractC1550e2.write(byteArrayOutputStream);
                }
            } else {
                for (AbstractC1550e abstractC1550e3 : (List) obj) {
                    abstractC1550e3.f4427e = this.f31887e;
                    abstractC1550e3.write(byteArrayOutputStream);
                }
            }
        }
    }

    /* renamed from: class */
    public abstract C12894e mo2919class(EnumC8271e enumC8271e);

    /* renamed from: default */
    public abstract void mo2920default(WritableByteChannel writableByteChannel, int i);

    @Override // defpackage.AbstractC16225e
    public boolean equals(Object obj) {
        return (obj instanceof AbstractC11095e) && this.f21995e.equals(((AbstractC11095e) obj).f21995e) && super.equals(obj);
    }

    /* renamed from: extends */
    public void mo2921extends(HashMap hashMap, String str, AbstractC1550e abstractC1550e) {
        boolean metrica = C16582e.startapp().metrica(str);
        C7936e c7936e = f21994e;
        if (!metrica && !C11673e.yandex().metrica(str) && !C16582e.yandex().metrica(str)) {
            if (!hashMap.containsKey(str)) {
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                c7936e.getClass();
                int i = C1724e.ad;
                hashMap.put(str, abstractC1550e);
                return;
            }
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i2 = C1724e.ad;
            if (this.f21998e.length() > 0) {
                this.f21998e = AbstractC1786e.signatures(new StringBuilder(), this.f21998e, ";");
            }
            this.f21998e = AbstractC1786e.signatures(new StringBuilder(), this.f21998e, str);
            ((AbstractC1550e) this.f21995e.get(str)).getSize();
            return;
        }
        if (!hashMap.containsKey(str)) {
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i3 = C1724e.ad;
            hashMap.put(str, abstractC1550e);
            return;
        }
        Object obj = hashMap.get(str);
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(abstractC1550e);
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e.getClass();
            int i4 = C1724e.ad;
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((AbstractC1550e) obj);
        arrayList.add(abstractC1550e);
        hashMap.put(str, arrayList);
        EnumC1005e[] enumC1005eArr5 = EnumC1005e.f3456e;
        c7936e.getClass();
        int i5 = C1724e.ad;
    }

    public final String firebase(EnumC8271e enumC8271e) {
        return (String) appmetrica(enumC8271e).appmetrica(BuildConfig.FLAVOR);
    }

    @Override // defpackage.AbstractC11463e
    public int getSize() {
        int i = 0;
        for (Object obj : this.f21995e.values()) {
            if (obj instanceof AbstractC1550e) {
                i = ((AbstractC1550e) obj).getSize() + i;
            } else if (obj instanceof C0617e) {
                Iterator it = ((C0617e) obj).f2825e.iterator();
                while (it.hasNext()) {
                    i += ((AbstractC1550e) it.next()).getSize();
                }
            } else if (obj instanceof List) {
                ListIterator listIterator = ((ArrayList) obj).listIterator();
                while (listIterator.hasNext()) {
                    i += ((AbstractC1550e) listIterator.next()).getSize();
                }
            }
        }
        return i;
    }

    /* renamed from: goto */
    public abstract Comparator mo2922goto();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5, types: [long] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.nio.channels.FileLock] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.nio.channels.FileChannel] */
    /* renamed from: implements, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2994implements(java.io.File r33, java.nio.ByteBuffer r34, byte[] r35, int r36, int r37, long r38) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11095e.m2994implements(java.io.File, java.nio.ByteBuffer, byte[], int, int, long):void");
    }

    public final AbstractC11095e inmobi(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        C12894e mo2919class = mo2919class(enumC8271e);
        int ordinal = enumC8271e.ordinal();
        EnumC8271e enumC8271e2 = EnumC8271e.DISC_TOTAL;
        EnumC8271e enumC8271e3 = EnumC8271e.DISC_NO;
        if (ordinal == 34) {
            isPro(mo2919class, enumC8271e3, enumC8271e2, true);
            return this;
        }
        if (ordinal == 36) {
            isPro(mo2919class, enumC8271e3, enumC8271e2, false);
            return this;
        }
        EnumC8271e enumC8271e4 = EnumC8271e.MOVEMENT_TOTAL;
        EnumC8271e enumC8271e5 = EnumC8271e.MOVEMENT_NO;
        if (ordinal == 70) {
            isPro(mo2919class, enumC8271e5, enumC8271e4, true);
            return this;
        }
        if (ordinal == 71) {
            isPro(mo2919class, enumC8271e5, enumC8271e4, false);
            return this;
        }
        EnumC8271e enumC8271e6 = EnumC8271e.TRACK_TOTAL;
        EnumC8271e enumC8271e7 = EnumC8271e.TRACK;
        if (ordinal == 137) {
            isPro(mo2919class, enumC8271e7, enumC8271e6, true);
            return this;
        }
        if (ordinal != 138) {
            applovin(mo2919class);
            return this;
        }
        isPro(mo2919class, enumC8271e7, enumC8271e6, false);
        return this;
    }

    /* renamed from: interface */
    public abstract AbstractC8623e mo2923interface();

    @Override // defpackage.InterfaceC9354e
    public final boolean isEmpty() {
        return this.f21995e.size() == 0;
    }

    public final void isPro(C12894e c12894e, EnumC8271e enumC8271e, EnumC8271e enumC8271e2, boolean z) {
        if (z) {
            if (firebase(enumC8271e2).length() == 0) {
                applovin(c12894e);
                return;
            } else {
                ((AbstractFrameBodyNumberTotal) ((AbstractC1550e) this.f21995e.get((String) c12894e.f25750e)).f28795e).setNumber((Integer) 0);
                return;
            }
        }
        if (firebase(enumC8271e).length() == 0) {
            applovin(c12894e);
        } else {
            ((AbstractFrameBodyNumberTotal) ((AbstractC1550e) this.f21995e.get((String) c12894e.f25750e)).f28795e).setTotal((Integer) 0);
        }
    }

    public final void isVip(RandomAccessFile randomAccessFile) {
        byte[] bArr = new byte[3];
        FileChannel channel = randomAccessFile.getChannel();
        channel.position();
        ByteBuffer allocate = ByteBuffer.allocate(10);
        channel.read(allocate, 0L);
        allocate.flip();
        if (m2995protected(allocate)) {
            randomAccessFile.seek(0L);
            randomAccessFile.write(bArr);
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final int license() {
        int i = 0;
        while (true) {
            try {
                i++;
            } catch (NoSuchElementException unused) {
                return i;
            }
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e loadAd(AbstractC13977e abstractC13977e) {
        AbstractC5542e.license(abstractC13977e, "artwork");
        smaato(advert(abstractC13977e));
        return this;
    }

    public AbstractC17475e metrica(EnumC8271e enumC8271e) {
        AbstractC5542e.license(enumC8271e, "genericKey");
        C12894e mo2919class = mo2919class(enumC8271e);
        AbstractC17475e subs = subs((String) mo2919class.f25750e);
        C13304e Signature = AbstractC17475e.Signature();
        String str = (String) mo2919class.f25752e;
        if (str == null) {
            if (AbstractC18544e.ad.contains(enumC8271e)) {
                C2171e listIterator = subs.listIterator(0);
                while (listIterator.hasNext()) {
                    InterfaceC3589e interfaceC3589e = (InterfaceC3589e) listIterator.next();
                    AbstractC12444e abstractC12444e = ((AbstractC1550e) interfaceC3589e).f28795e;
                    if ((abstractC12444e instanceof AbstractFrameBodyNumberTotal) && ((AbstractFrameBodyNumberTotal) abstractC12444e).getNumber() != null) {
                        Signature.metrica(interfaceC3589e);
                    }
                }
                return Signature.billing();
            }
            if (!AbstractC18544e.vip.contains(enumC8271e)) {
                return subs;
            }
            C2171e listIterator2 = subs.listIterator(0);
            while (listIterator2.hasNext()) {
                InterfaceC3589e interfaceC3589e2 = (InterfaceC3589e) listIterator2.next();
                AbstractC12444e abstractC12444e2 = ((AbstractC1550e) interfaceC3589e2).f28795e;
                if ((abstractC12444e2 instanceof AbstractFrameBodyNumberTotal) && ((AbstractFrameBodyNumberTotal) abstractC12444e2).getTotal() != null) {
                    Signature.metrica(interfaceC3589e2);
                }
            }
            return Signature.billing();
        }
        C2171e listIterator3 = subs.listIterator(0);
        while (listIterator3.hasNext()) {
            InterfaceC3589e interfaceC3589e3 = (InterfaceC3589e) listIterator3.next();
            AbstractC12444e abstractC12444e3 = ((AbstractC1550e) interfaceC3589e3).f28795e;
            if (abstractC12444e3 instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC12444e3).getDescription().equals(str)) {
                    Signature.metrica(interfaceC3589e3);
                }
            } else if (abstractC12444e3 instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC12444e3).getDescription().equals(str)) {
                    Signature.metrica(interfaceC3589e3);
                }
            } else if (abstractC12444e3 instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC12444e3).getDescription().equals(str)) {
                    Signature.metrica(interfaceC3589e3);
                }
            } else if (abstractC12444e3 instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC12444e3).getOwner().equals(str)) {
                    Signature.metrica(interfaceC3589e3);
                }
            } else if (abstractC12444e3 instanceof FrameBodyIPLS) {
                Iterator<Pair> it = ((FrameBodyIPLS) abstractC12444e3).getPairing().getMapping().iterator();
                while (it.hasNext()) {
                    if (it.next().getKey().equals(str)) {
                        Signature.metrica(interfaceC3589e3);
                    }
                }
            } else {
                if (!(abstractC12444e3 instanceof FrameBodyTIPL)) {
                    if (abstractC12444e3 instanceof FrameBodyUnsupported) {
                        return subs;
                    }
                    throw new RuntimeException("Need to implement getFields(FieldKey genericKey) for:" + abstractC12444e3.getClass());
                }
                Iterator<Pair> it2 = ((FrameBodyTIPL) abstractC12444e3).getPairing().getMapping().iterator();
                while (it2.hasNext()) {
                    if (it2.next().getKey().equals(str)) {
                        Signature.metrica(interfaceC3589e3);
                    }
                }
            }
        }
        return Signature.billing();
    }

    @Override // defpackage.InterfaceC9354e
    public final InterfaceC9354e mopub(EnumC8271e enumC8271e, String... strArr) {
        smaato(ad(enumC8271e, strArr));
        return this;
    }

    /* renamed from: native */
    public void mo2924native(String str, AbstractC1550e abstractC1550e) {
        if (abstractC1550e.f28795e instanceof FrameBodyEncrypted) {
            mo2921extends(this.f21999e, str, abstractC1550e);
        } else {
            mo2921extends(this.f21995e, str, abstractC1550e);
        }
    }

    public String premium() {
        return DataTypes.OBJ_MIME_TYPE;
    }

    /* renamed from: protected, reason: not valid java name */
    public final boolean m2995protected(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        byteBuffer.position();
        byteBuffer.limit();
        byteBuffer.capacity();
        f21994e.getClass();
        int i = C1724e.ad;
        byte[] bArr = new byte[3];
        byteBuffer.get(bArr, 0, 3);
        return Arrays.equals(bArr, f21993e) && byteBuffer.get() == pro() && byteBuffer.get() == 0;
    }

    @Override // defpackage.InterfaceC1425e
    public final void smaato(InterfaceC3589e interfaceC3589e) {
        boolean z = interfaceC3589e instanceof AbstractC1550e;
        if (!z && !(interfaceC3589e instanceof C0617e)) {
            throw new Exception("Field " + interfaceC3589e + " is not of type AbstractID3v2Frame nor AggregatedFrame");
        }
        if (!z) {
            this.f21995e.put(interfaceC3589e.getId(), interfaceC3589e);
            return;
        }
        AbstractC1550e abstractC1550e = (AbstractC1550e) interfaceC3589e;
        Object obj = this.f21995e.get(abstractC1550e.f4425e);
        if (obj == null) {
            this.f21995e.put(abstractC1550e.f4425e, interfaceC3589e);
            return;
        }
        if (obj instanceof AbstractC1550e) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((AbstractC1550e) obj);
            m2996throw(abstractC1550e, arrayList);
        } else if (obj instanceof List) {
            m2996throw(abstractC1550e, (List) obj);
        }
    }

    @Override // defpackage.InterfaceC9354e
    public final AbstractC9621e startapp(EnumC8271e enumC8271e) {
        return appmetrica(enumC8271e);
    }

    public final AbstractC17475e subs(String str) {
        Object obj = this.f21995e.get(str);
        if (obj == null) {
            C2171e c2171e = AbstractC17475e.f34223e;
            return C1410e.f4222e;
        }
        if (obj instanceof List) {
            return AbstractC17475e.remoteconfig((List) obj);
        }
        if (obj instanceof AbstractC1550e) {
            return AbstractC17475e.ads((InterfaceC3589e) obj);
        }
        throw new RuntimeException(AbstractC1634e.advert(obj, "Found entry in frameMap that was not a frame or a list:"));
    }

    public abstract AbstractC1550e tapsense(String str);

    /* renamed from: throw, reason: not valid java name */
    public final void m2996throw(AbstractC1550e abstractC1550e, List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC1550e abstractC1550e2 = (AbstractC1550e) listIterator.next();
            AbstractC12444e abstractC12444e = abstractC1550e.f28795e;
            if (abstractC12444e instanceof FrameBodyTXXX) {
                if (((FrameBodyTXXX) abstractC12444e).getDescription().equals(((FrameBodyTXXX) abstractC1550e2.f28795e).getDescription())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else if (abstractC12444e instanceof FrameBodyWXXX) {
                if (((FrameBodyWXXX) abstractC12444e).getDescription().equals(((FrameBodyWXXX) abstractC1550e2.f28795e).getDescription())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else if (abstractC12444e instanceof FrameBodyCOMM) {
                if (((FrameBodyCOMM) abstractC12444e).getDescription().equals(((FrameBodyCOMM) abstractC1550e2.f28795e).getDescription())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else if (abstractC12444e instanceof FrameBodyUFID) {
                if (((FrameBodyUFID) abstractC12444e).getOwner().equals(((FrameBodyUFID) abstractC1550e2.f28795e).getOwner())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else if (abstractC12444e instanceof FrameBodyUSLT) {
                if (((FrameBodyUSLT) abstractC12444e).getDescription().equals(((FrameBodyUSLT) abstractC1550e2.f28795e).getDescription())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else if (abstractC12444e instanceof FrameBodyPOPM) {
                if (((FrameBodyPOPM) abstractC12444e).getEmailToUser().equals(((FrameBodyPOPM) abstractC1550e2.f28795e).getEmailToUser())) {
                    listIterator.set(abstractC1550e);
                    this.f21995e.put(abstractC1550e.f4425e, list);
                    return;
                }
            } else {
                if (abstractC12444e instanceof AbstractFrameBodyNumberTotal) {
                    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal = (AbstractFrameBodyNumberTotal) abstractC12444e;
                    AbstractFrameBodyNumberTotal abstractFrameBodyNumberTotal2 = (AbstractFrameBodyNumberTotal) abstractC1550e2.f28795e;
                    if (abstractFrameBodyNumberTotal.getNumber() != null && abstractFrameBodyNumberTotal.getNumber().intValue() > 0) {
                        abstractFrameBodyNumberTotal2.setNumber(abstractFrameBodyNumberTotal.getNumberAsText());
                    }
                    if (abstractFrameBodyNumberTotal.getTotal() == null || abstractFrameBodyNumberTotal.getTotal().intValue() <= 0) {
                        return;
                    }
                    abstractFrameBodyNumberTotal2.setTotal(abstractFrameBodyNumberTotal.getTotalAsText());
                    return;
                }
                if (abstractC12444e instanceof AbstractFrameBodyPairs) {
                    ((AbstractFrameBodyPairs) abstractC1550e2.f28795e).addPair(((AbstractFrameBodyPairs) abstractC12444e).getText());
                    return;
                }
            }
        }
        if (!mo2923interface().metrica(abstractC1550e.f4425e)) {
            this.f21995e.put(abstractC1550e.f4425e, abstractC1550e);
        } else {
            list.add(abstractC1550e);
            this.f21995e.put(abstractC1550e.f4425e, list);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag content:\n");
        Iterator adcel = adcel();
        while (true) {
            C14950e c14950e = (C14950e) adcel;
            if (!c14950e.hasNext()) {
                return sb.toString();
            }
            InterfaceC3589e interfaceC3589e = (InterfaceC3589e) c14950e.next();
            sb.append("\t");
            sb.append(interfaceC3589e.getId());
            sb.append(":");
            sb.append(interfaceC3589e.toString());
            sb.append("\n");
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m2997while(String str) {
        EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
        f21994e.getClass();
        int i = C1724e.ad;
        this.f21995e.remove(str);
    }
}
