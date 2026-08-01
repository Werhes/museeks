package ealvatag.tag.id3.framebody;

import defpackage.AbstractC18186e;
import defpackage.C0215e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.NumberHashMap;
import ealvatag.tag.datatype.SynchronisedTempoCode;
import ealvatag.tag.datatype.SynchronisedTempoCodeList;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodySYTC extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final InterfaceC4279e LOG;
    public static final int MILLISECONDS = 2;
    public static final int MPEG_FRAMES = 1;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        LOG = new C7936e(2);
    }

    public FrameBodySYTC() {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, 2);
    }

    public FrameBodySYTC(int i, byte[] bArr) {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i));
        setObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST, bArr);
    }

    public FrameBodySYTC(FrameBodySYTC frameBodySYTC) {
        super(frameBodySYTC);
    }

    public FrameBodySYTC(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodySYTC(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    public void addTempo(long j, int i) {
        removeTempo(j);
        List list = (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST);
        int i2 = 0;
        if (!list.isEmpty() && ((SynchronisedTempoCode) list.get(0)).getTimestamp() <= j) {
            Iterator it = list.iterator();
            while (it.hasNext() && j >= ((SynchronisedTempoCode) it.next()).getTimestamp()) {
                i2++;
            }
        }
        list.add(i2, new SynchronisedTempoCode(DataTypes.OBJ_SYNCHRONISED_TEMPO, this, i, j));
    }

    public void clearTempi() {
        ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).clear();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "SYTC";
    }

    public Map<Long, Integer> getTempi() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (SynchronisedTempoCode synchronisedTempoCode : (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)) {
            linkedHashMap.put(Long.valueOf(synchronisedTempoCode.getTimestamp()), Integer.valueOf(synchronisedTempoCode.getTempo()));
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public int getTimestampFormat() {
        return ((Number) getObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT)).intValue();
    }

    public List<Long> getTimestamps() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SynchronisedTempoCode) it.next()).getTimestamp()));
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC11463e
    public void read(ByteBuffer byteBuffer) {
        super.read(byteBuffer);
        long j = 0;
        for (SynchronisedTempoCode synchronisedTempoCode : (List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)) {
            if (synchronisedTempoCode.getTimestamp() < j) {
                InterfaceC4279e interfaceC4279e = LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                synchronisedTempoCode.getTimestamp();
                ((C7936e) interfaceC4279e).getClass();
                int i = C1724e.ad;
            }
            j = synchronisedTempoCode.getTimestamp();
        }
    }

    public boolean removeTempo(long j) {
        ListIterator listIterator = ((List) getObjectValue(DataTypes.OBJ_SYNCHRONISED_TEMPO_LIST)).listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            SynchronisedTempoCode synchronisedTempoCode = (SynchronisedTempoCode) listIterator.next();
            if (j == synchronisedTempoCode.getTimestamp()) {
                listIterator.remove();
                z = true;
            }
            if (j > synchronisedTempoCode.getTimestamp()) {
                break;
            }
        }
        return z;
    }

    public void setTimestampFormat(int i) {
        C0215e.ad().getValue(i);
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i));
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new SynchronisedTempoCodeList(this));
    }
}
