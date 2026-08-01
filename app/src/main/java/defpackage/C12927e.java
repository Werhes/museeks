package defpackage;

import ealvatag.tag.id3.framebody.AbstractID3v2FrameBody;
import ealvatag.tag.id3.framebody.FrameBodyCOMM;
import ealvatag.tag.id3.framebody.FrameBodyTIPL;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۨٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12927e {
    public final boolean Signature;
    public final HashMap ad;
    public final boolean adcel;
    public final long admob;
    public final boolean advert;
    public final byte amazon;
    public final boolean appmetrica;
    public final boolean billing;
    public final HashMap license;
    public boolean loadAd;
    public final HashMap metrica;
    public final boolean mopub;
    public final int pro;
    public final boolean purchase;
    public final boolean remoteconfig = true;
    public final int signatures;
    public final boolean smaato;
    public final boolean startapp;
    public final boolean subscription;
    public final int tapsense;
    public final HashMap vip;
    public final boolean yandex;
    public static final ConcurrentHashMap isVip = new ConcurrentHashMap();
    public static final String inmobi = "default";
    public static final ReentrantLock isPro = new ReentrantLock();

    public C12927e() {
        this.pro = 1;
        this.signatures = 3;
        this.ad = new HashMap();
        this.vip = new HashMap();
        this.metrica = new HashMap();
        this.license = new HashMap();
        this.appmetrica = true;
        this.purchase = true;
        this.billing = true;
        this.yandex = true;
        this.startapp = true;
        this.adcel = true;
        this.mopub = true;
        this.advert = true;
        this.smaato = true;
        this.amazon = (byte) 1;
        this.loadAd = false;
        this.Signature = true;
        this.admob = 4194304L;
        this.tapsense = 2;
        this.subscription = true;
        this.pro = 3;
        this.signatures = 3;
        this.ad = new HashMap();
        this.appmetrica = true;
        this.purchase = true;
        this.billing = true;
        this.yandex = true;
        this.startapp = true;
        this.adcel = true;
        this.mopub = true;
        this.advert = true;
        this.vip = new HashMap();
        this.metrica = new HashMap();
        this.license = new HashMap();
        this.smaato = true;
        this.amazon = (byte) 1;
        this.loadAd = false;
        this.Signature = true;
        this.admob = 5000000L;
        this.tapsense = 2;
        this.subscription = false;
        if (C4324e.f9456e == null) {
            synchronized (AbstractC16025e.class) {
                try {
                    if (C4324e.f9456e == null) {
                        C4324e.f9456e = new C4324e();
                    }
                } finally {
                }
            }
        }
        AbstractC7014e it = C4324e.f9456e.f9457e.keySet().iterator();
        while (it.hasNext()) {
            this.vip.put((String) it.next(), Boolean.TRUE);
        }
        ad(FrameBodyCOMM.class, "ultimix");
        ad(FrameBodyCOMM.class, "dance");
        ad(FrameBodyCOMM.class, "mix");
        ad(FrameBodyCOMM.class, "remix");
        ad(FrameBodyCOMM.class, "rmx");
        ad(FrameBodyCOMM.class, "live");
        ad(FrameBodyCOMM.class, "cover");
        ad(FrameBodyCOMM.class, "soundtrack");
        ad(FrameBodyCOMM.class, "version");
        ad(FrameBodyCOMM.class, "acoustic");
        ad(FrameBodyCOMM.class, "original");
        ad(FrameBodyCOMM.class, "cd");
        ad(FrameBodyCOMM.class, "extended");
        ad(FrameBodyCOMM.class, "vocal");
        ad(FrameBodyCOMM.class, "unplugged");
        ad(FrameBodyCOMM.class, "acapella");
        ad(FrameBodyCOMM.class, "edit");
        ad(FrameBodyCOMM.class, "radio");
        ad(FrameBodyCOMM.class, "original");
        ad(FrameBodyCOMM.class, "album");
        ad(FrameBodyCOMM.class, "studio");
        ad(FrameBodyCOMM.class, "instrumental");
        ad(FrameBodyCOMM.class, "unedited");
        ad(FrameBodyCOMM.class, "karoke");
        ad(FrameBodyCOMM.class, "quality");
        ad(FrameBodyCOMM.class, "uncensored");
        ad(FrameBodyCOMM.class, "clean");
        ad(FrameBodyCOMM.class, "dirty");
        ad(FrameBodyTIPL.class, "f.");
        ad(FrameBodyTIPL.class, "feat");
        ad(FrameBodyTIPL.class, "feat.");
        ad(FrameBodyTIPL.class, "featuring");
        ad(FrameBodyTIPL.class, "ftng");
        ad(FrameBodyTIPL.class, "ftng.");
        ad(FrameBodyTIPL.class, "ft.");
        ad(FrameBodyTIPL.class, "ft");
        for (String str : (String[]) C18540e.m4564default().f36383e) {
            ad(FrameBodyCOMM.class, str);
        }
        vip("v.", "vs.");
        vip("vs.", "vs.");
        vip("versus", "vs.");
        vip("f.", "feat.");
        vip("feat", "feat.");
        vip("featuring", "feat.");
        vip("ftng.", "feat.");
        vip("ftng", "feat.");
        vip("ft.", "feat.");
        vip("ft", "feat.");
        this.metrica.put("(", ")");
        this.metrica.put("[", "]");
        this.metrica.put("{", "}");
        this.metrica.put("<", ">");
    }

    public static C12927e license() {
        String str = inmobi;
        ReentrantLock reentrantLock = isPro;
        reentrantLock.lock();
        try {
            ConcurrentHashMap concurrentHashMap = isVip;
            C12927e c12927e = (C12927e) concurrentHashMap.get(str);
            if (c12927e == null) {
                c12927e = new C12927e();
                concurrentHashMap.put(str, c12927e);
            }
            return c12927e;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static C10768e metrica() {
        if (license().tapsense != 0) {
            return new C10768e();
        }
        throw null;
    }

    public final void ad(Class cls, String str) {
        LinkedList linkedList;
        if (!AbstractID3v2FrameBody.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(AbstractC0054e.subs(cls, "Invalid class type. Must be AbstractId3v2FrameBody "));
        }
        if (str == null || str.length() <= 0) {
            return;
        }
        if (this.ad.containsKey(cls)) {
            linkedList = (LinkedList) this.ad.get(cls);
        } else {
            linkedList = new LinkedList();
            this.ad.put(cls, linkedList);
        }
        linkedList.add(str);
    }

    public final void vip(String str, String str2) {
        this.license.put(str, str2);
    }
}
